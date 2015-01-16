;(function ($, window, undefined) {
                                    var link_select =(function (tdist) {
                                        var tlist = tdist;
                                        var cache = {};
                                        function set (str) {
                                            var pr = [];
                                            for(var i in tlist) {
                                                if(tlist[i][1] == str) {
                                                    pr.push('<option value="'+tlist[i][0]+'" txt="'+i+'">'+tlist[i][0]+'</option>');
                                                }
                                            }
                                            return pr.join('');
                                        }

                                        return {
                                            Init:function (province, city, area) {
                                                province.html(set('1'));
                                                province.on("change", function () {
                                                    var val = $(this).find("option:selected").attr("txt");
                                                        
                                                    city.html(set(val)).change();
                                                }).change();
                                                city.on("change", function () {
                                                    var val = $(this).find("option:selected").attr("txt");

                                                    var dat = set(val);
                                                    area.html(set(val));
                                                    if(dat.length) {
                                                        area.show().html(set(val));
                                                    }else {
                                                        area.hide();
                                                    }
                                                }).change();

                                                

                                            },
                                            Set:function (province, city, area, istext) {
                                                if(istext) {
                                                    cache['province'].find("option[value='"+province+"']").attr("selected", true).change();
                                                    setTimeout(function () {
                                                        cache['city'].find("option[value='"+city+"']").attr("selected", true).change();
                                                        setTimeout(function () {
                                                            cache['area'].find("option[value='"+area+"']").attr("selected", true);
                                                        },0);
                                                    },0);
                                                }else {
                                                    cache['province'].val(province);
                                                    cache['city'].html(set(province)).val(city);
                                                    cache['area'].html(set(city)).val(area);
                                                }
                                                
                                            }
                                        }
                                    })(tdist);

                                    
                                    $(function () {
                                        var province = $("#js-province")
                                            , city = $("#js-city")
                                            , area = $("#js-area");

                                        link_select.Init(province, city, area);

                                        var _province = $('#js-province').attr("data-province"),
                                                    _city = $('#js-city').attr("data-city"),
                                                    _area = $('#js-area').attr("data-area");

                                            if( _province ){
                                                $('#js-province').val($('#js-province').data("province")).change();
                                                $('#js-province').removeAttr("data-province");
                                                if( _city ){
                                                    $('#js-city').val($('#js-city').data("city")).change();
                                                    $('#js-city').removeAttr("data-city");
                                                    if( _area ){
                                                        $('#js-area').val($('#js-area').data("area")).change();
                                                        $('#js-area').removeAttr("data-area");
                                                    }
                                                }
                                            }
                                            
                                            link_select.Init($(".js-province"), $(".js-city"), $(".js-country"));
                                            link_select.Init($(".js-province_c"), $(".js-city_c"), $(".js-country_c"));

                                    })
                                   

                                })(jQuery, window);