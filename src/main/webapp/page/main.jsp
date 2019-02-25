<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<%@ include file="../page/tag.jsp" %>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title>简介</title>
		<link rel="stylesheet" href="${baseurl}/plugins/layui/css/layui.css" media="all" />
		<link rel="stylesheet" href="${baseurl}/css/global.css" media="all">
		<link rel="stylesheet" href="${baseurl}/css/main.css" />
		<link href="${baseurl}/css/mycss/eurisia_echar.css" rel="stylesheet" type="text/css"/>
		<script src="${baseurl}/js/myjs/jquery.min.js"></script>
		<script src="${baseurl}/js/myjs/echarts.min.js"></script>
	</head>

	<body>
		<div class="admin-main">

			<fieldset class="layui-elem-field">
				<legend><b>汽车零配件销售管理系统</b></legend>
				<div class="layui-field-box">



					<div style="margin: 15px;">
						<fieldset class="layui-elem-field site-demo-button">
							<legend>汽车零配件销售曲线统计图</legend>

							<div class="main_his">
								<div id="main_Histogram" ></div>
								<script type="text/javascript">
                                    var dateOne = new Array(10);
                                    var dateTwo = new Array(10);
                                    let yearOne = "";
                                    let yearTwo = "";
                                    let subtext = "";
                                    $.post("${pageContext.request.contextPath}/MainController/findMainController", function (data) {
                                        let valueOne = data.recovery;
                                        let valueTwo = data.sale;
                                       for(let i = 0; i<10;i++){
                                           dateOne[i] = parseInt(valueOne[i].recovery_capacity) * parseInt(valueOne[i].recovery_pirce);
                                           dateTwo[i] = parseInt(valueTwo[i].sale_capacity) * parseInt(valueTwo[i].sale_pirce);
									   }
                                        // 树状图
                                        var myChart = echarts.init(document.getElementById("main_Histogram"));

                                        var option = {
                                            title: {
                                                text: '近十次回收与销售额统计（单位：元）'
                                            },
                                            tooltip: {
                                                trigger: 'axis'
                                            },
                                            color: ["#FF0000", "#00BFFF", "#FF00FF", "#1ce322", "#000000", '#EE7942'],
                                            legend: {
                                                data: ['进货金额', '销售金额']
                                            },
                                            grid: {
                                                left: '3%',
                                                right: '4%',
                                                bottom: '3%',
                                                containLabel: true
                                            },
                                            toolbox: {
                                                feature: {
                                                    saveAsImage: {}
                                                }
                                            },
                                            xAxis: {
                                                type: 'category',
                                                boundaryGap: false,
                                                data: ['最新一次', '2', '3', '4', '5', '6', '7', '8', '9', '10']
                                            },
                                            yAxis: [{
                                                type: 'value',
                                                axisLabel: {
                                                    formatter: '{value} '
                                                }
                                            }],

                                            series: [{
                                                name: '进货金额',
                                                type: 'line',
                                                label: {
                                                    normal: {
                                                        show: true,
                                                        position: 'top'
                                                    }
                                                },
                                                lineStyle: {
                                                    normal: {
                                                        width: 2,
                                                    }
                                                },
                                                data: dateOne
                                            }, {
                                                name: '销售金额',
                                                type: 'line',
                                                label: {
                                                    normal: {
                                                        show: true,
                                                        position: 'top'
                                                    }
                                                },
                                                lineStyle: {
                                                    normal: {
                                                        width: 2,
                                                    }
                                                },
                                                data: dateTwo
                                            }]
                                        };

                                        // 使用刚指定的配置项和数据显示图表。
                                        myChart.setOption(option);
                                    });
								</script>

							</div>

						</fieldset>

					</div>
				</div>
			</fieldset>
		</div>
	</body>

</html>
