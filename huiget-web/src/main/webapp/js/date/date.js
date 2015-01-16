var Validate = {
    CheckDate: function (year, month, day ) {
        var myDate = new Date();
        myDate.setFullYear( year, (month - 1), day );
        return ((myDate.getMonth()+1) == month && day<32); 
    }
};

String.format = function(str) {
    var args = arguments, re = new RegExp("%([1-" + args.length + "])", "g");
    return String(str).replace(
        re,
        function($1, $2) {
            return args[$2];
        }
        );
};


var Calendar = (function(){
    var _temp = {
        top:'<div class="date-head" rel="js_cal_show_box"><a href="javascript:;" class="btn-today" rel="js_cal_now_btn">今天</a><strong rel="js_title"></strong><span class="date-change"><a href="javascript:;" rel="js_cal_pre_btn" class="prev">上个月</a><a href="javascript:;" rel="js_cal_next_btn" class="next">下个月</a></span></div>',
        sel:'<div class="date-head" style="display:none;" rel="js_cal_sel_box"><select id="js_cal_year_sel"></select><select id="js_cal_month_sel"></select><a href="javascript:;" class="btn-day">确定</a></div>',
        head:'<ul class="date-wkday"><li>一</li><li>二</li><li>三</li><li>四</li><li>五</li><li>六</li><li>日</li></ul>',
        con:'<ul class="date-contents"></ul>',
        item:'<li><a href="javascript:;" rel="item" %2>%1</a></li>',
        item2:'<li><span>%1</span></li>'
    }
    
    var initSelect = function(){
        var optionObj = {};
        var optgroupObj = {};
        var df = document.createDocumentFragment();
        for(i=1901;i<2030;i++){
            optionObj = document.createElement("option");
            optionObj.value = i;
            optionObj.innerHTML = i+"年";
            df.appendChild(optionObj);
            if(i%10 == 0){
                optgroupObj = document.createElement("optgroup");
                optgroupObj.setAttribute("label","───");
                df.appendChild(optgroupObj);
            }
        }
        document.getElementById("js_cal_year_sel").appendChild(df);
        var monthSel = document.getElementById("js_cal_month_sel");
        for(var i = 1,len = 13; i < len; i++){
            var optionItem = document.createElement("option");
            optionItem.value = i;
            optionItem.innerHTML = i+"月";
            monthSel.appendChild(optionItem);
        }
    };
    
    function getMonthDays(year, month) {
        var monthDays = [31,28,31,30,31,30,31,31,30,31,30,31];
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            monthDays[1] = 29
        }
        return monthDays[month]
    }
    
    var _calBox;
    var _activeInput;
    var _calHideState = true;
    var _activeDate = new Date();
    
    var createCal = function(date){
        var calconbox;
        _activeDate = date;
        _activeInput.val(date.getFullYear() + "-" + getTowString(Number(date.getMonth()+1)) +"-" + getTowString(date.getDate()));

        //计算星期几
        var today = new Array("星期天","星期一","星期二","星期三","星期四","星期五","星期六");
        //_activeInput.next().html(today[date.getDay()]);
        //end

        if(!_calBox){
            _calBox = $('<div style="display:none;position:absolute;z-index:999;"></div>');
            $(document.body).append(_calBox);
            _calBox.bind("mouseover",function(){
                _calHideState = false;
            }).bind("mouseout",function(){
                _calHideState = true;
            });
            calconbox = $('<div class="date-box"></div>');
            calconbox.append($(_temp.top));
            calconbox.append($(_temp.sel));
            calconbox.append($(_temp.head));
            calconbox.append($(_temp.con));
            _calBox.append(calconbox);
            _calBox.click(function(e){
                var src = e.target || window.event.srcElement;
                if(src.tagName.toUpperCase() != "SELECT" && $(src).attr("rel") != "item"){
                    _activeInput[0].focus();
                }
                
            });
            calconbox.find("a[rel='js_cal_pre_btn']").click(function(){
                _activeDate = new Date(_activeDate.getFullYear(),(_activeDate.getMonth()-1),_activeDate.getDate());
                createCal(_activeDate);
            });
            calconbox.find("a[rel='js_cal_next_btn']").click(function(){
                _activeDate = new Date(_activeDate.getFullYear(),(_activeDate.getMonth()+1),_activeDate.getDate());
                createCal(_activeDate);
            });
            calconbox.find("a[rel='js_cal_now_btn']").click(function(){
                _activeDate = new Date();
                createCal(_activeDate);
                 _callback&&_callback();
            });
            calconbox.find("strong[rel='js_title']").click(function(){
                calconbox.find("div.date-head[rel='js_cal_show_box']").hide();
                calconbox.find("div.date-head[rel='js_cal_sel_box']").show();
                document.getElementById("js_cal_year_sel").value = _activeDate.getFullYear();
                document.getElementById("js_cal_month_sel").value = (_activeDate.getMonth() + 1);
            })
            calconbox.find("div.date-head[rel='js_cal_sel_box'] a.btn-day").click(function(e){

                calconbox.find("div.date-head[rel='js_cal_show_box']").show();
                calconbox.find("div.date-head[rel='js_cal_sel_box']").hide();
                var selY = document.getElementById("js_cal_year_sel").value;
                var selM = Number(document.getElementById("js_cal_month_sel").value);
                if(Validate.CheckDate(selY,selM,_activeDate.getDate())){
                    Calendar.Select(selY,selM,_activeDate.getDate());
                }
                else{
                    Calendar.Select(selY,selM,1);
                }
                setTimeout(function () {
                    if(_calBox) _calBox.hide();
                },0)

            })
            initSelect();
            
        }
        if(!calconbox){
            calconbox = _calBox.find(".date-box");
        }

        var days = getMonthDays(date.getFullYear(),date.getMonth());
        var html = "";
        var y = date.getFullYear();
        var m = date.getMonth();
        var now = new Date();
        
        calconbox.find("[rel='js_title']").html(y + "年" + (m+1) + "月");
        
        var firstD = new Date(y,m,1);
        startDay = firstD.getDay()||7;
        var col = 0;
        for (var i = 1; i < startDay; i++) {
            html += String.format(_temp.item2," ");
            col++;
        }
        for (var i = 1; i <= days; i++) {
            var calsies = "";
            if(i == date.getDate()){
                calsies = " class='tday' ";
            }
            html += String.format(_temp.item,i,calsies+" onclick='Calendar.Select("+y+","+(m+1)+","+i+")'");
        }
        var dataContent = calconbox.find(".date-contents");
        dataContent.html(html);
    }
    
    var getTowString = function(num){
        var num = num.toString();
        if(num.length == 1){
            return  "0" + num;
        }
        return num;
    }
    var _callback;
    var Return = {
        Bind: function(input,callback, left, top, leve){
            _callback = callback;
            var tt = true;
            var m;
            input.bind("focus",function(){
                var dd;
                if(/^\d{4}-\d{1,2}-\d{1,2}$/.test($(this).val())){
                    var v = $(this).val().split("-");
                    if(Validate.CheckDate(v[0],v[1],v[2])){
                        dd = new Date(v[0],(Number(v[1]) - 1),v[2]);
                    }
                    else{
                        dd = new Date();
                    }
                }
                else{
                    dd = new Date();
                }
                                        
                var t = $(this).offset().top + $(this).height() + 20;
                var l = $(this).offset().left;
                _activeInput = $(this);
                createCal(dd);
                _calBox.show().css({top:top || t,left: left || l});


                if(leve && tt) {
                    _calBox.bind('mouseover', function () {
                        m && clearTimeout(m);
                        _calBox.show();
                    })
                    _calBox.bind('mouseout',function () {
                        m && clearTimeout(m);
                        m = setTimeout(function () {
                            _calBox.hide();
                        },200);
                    })
                    tt = false;
                }

            }).bind("blur",function(){
                if(_calHideState && _calBox) {
                    _calBox.hide();
                }
            });
        },
        Select: function(y,m,d){
            //计算星期几
            if(!_calBox.find('select').parent().is(":hidden")) {
                y = _calBox.find('select').eq(0).val();
                m = _calBox.find('select').eq(1).val();
            }
            var day = new Date(Date.parse(y+"/"+m+"/"+d)); //将日期值格式化
            var today = new Array("星期天","星期一", "星期二", "星期三","星期四","星期五","星期六");
            _activeInput.val(y + "-" + getTowString(m) +"-" + getTowString(d));
            _callback&&_callback();
            _calHideState = true;
            if(_calHideState && _calBox) {
                if(_calBox.find('#js_cal_year_sel').length){
                    _calBox.find('#js_cal_year_sel').parent().hide().prev().show();
                }
                _calBox.hide();
            };
        }
    };
    return Return;
})();