(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-3ae526ea"],{"38dd":function(e,t,a){"use strict";a.r(t);var i=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("Layout",[a("PageHeader",{attrs:{title:e.title,items:e.items}}),a("div",{staticClass:"row"},[a("div",{staticClass:"col-xl-12"},[a("ShowCount")],1)]),a("div",{staticClass:"row"},[a("div",{staticClass:"col-lg-4"},[a("RecentActivity")],1),a("div",{staticClass:"col-xl-8"},[a("Pie")],1)]),a("div",{staticClass:"row"},[a("div",{staticClass:"col-lg-12"},[a("CheckExample")],1)]),a("div",{staticClass:"row"},[a("div",{staticClass:"col-lg-12"},[a("Tree")],1)])],1)},l=[],n=a("5658"),s=a("2579"),r=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("div",{staticClass:"row"},e._l(e.statData,(function(t,i){return a("div",{key:i,staticClass:"col-md-4"},[a("div",{staticClass:"card"},[a("div",{staticClass:"card-body"},[a("div",{staticClass:"media"},[a("div",{staticClass:"media-body overflow-hidden"},[a("p",{staticClass:"text-truncate font-size-18 mb-6 ml-3"},[e._v(e._s(t.title))]),a("h4",{staticClass:"mb-0 ml-3"},[e._v(e._s(t.value))])]),a("div",{staticClass:"text-primary"},[a("i",{class:t.icon+" font-size-48"})])])]),a("div",{staticClass:"card-body border-top py-3"},[a("div",{staticClass:"text-truncate"},[a("span",{staticClass:"badge badge-soft-success font-size-16 ml-3"},[a("i",{staticClass:"mdi mdi-menu-up"}),e._v(" "+e._s(t.subvalue)+" ")]),a("span",{staticClass:"text-muted ml-2 font-size-8"},[e._v("From 2021-06-21")])])])])])})),0)},o=[],c=a("6cba"),d=a.n(c),m={data:function(){return{memberData:"",statData:""}},methods:{getMember:function(){var e=this;d.a.get("http://82.156.8.5:8848/host2task/getAnalysisResult?taskId=1").then((function(t){console.log(t),e.memberData=t.data.checkResult,e.statData=[{title:"核查总条目",icon:"ri-stack-line",value:47*parseInt(e.memberData["核查总条目数"]),subvalue:"100 %"},{title:"不合格条目",icon:"ri-store-2-line",value:47*parseInt(e.memberData["不合格条目数"]),subvalue:" 70 % "},{title:"合格条目",icon:"ri-briefcase-4-line",value:47*parseInt(e.memberData["合格条目数"]),subvalue:" 10% "}]})).catch((function(e){console.log(e)}))}},created:function(){this.getMember()}},u=m,v=a("2877"),p=Object(v["a"])(u,r,o,!1,null,null,null),f=p.exports,b=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("div",{staticClass:"card"},[a("div",{staticClass:"card-body"},[a("b-dropdown",{staticClass:"float-right",attrs:{right:"","toggle-class":"arrow-none card-drop",variant:"white"},scopedSlots:e._u([{key:"button-content",fn:function(){return[a("i",{staticClass:"mdi mdi-dots-vertical"})]},proxy:!0}])},[a("b-dropdown-item",[e._v("一天内")]),a("b-dropdown-item",[e._v("一周内")]),a("b-dropdown-item",[e._v("一个月内")])],1),a("h3",{staticClass:"card-title mb-4 text-muted",staticStyle:{"font-size":"20px"}},[e._v("最近检测记录")]),a("div",{staticStyle:{"max-height":"550px"},attrs:{"data-simplebar":""}},[a("ul",{staticClass:"list-unstyled activity-wid"},e._l(e.activityData,(function(t,i){return a("li",{key:i,staticClass:"activity-list"},[a("div",{staticClass:"activity-icon avatar-xs"},[a("span",{staticClass:"avatar-title bg-soft-primary text-primary rounded-circle"},[a("i",{class:""+t.icon})])]),a("div",[a("div",[a("h5",{staticClass:"font-size-16"},[e._v(" "+e._s(t.date)+" "),a("small",{staticClass:"text-muted font-size-14"},[e._v(e._s(t.time))])])]),a("div",[a("p",{staticClass:"text-muted mb-0 font-size-18"},[e._v(e._s(t.title))])])])])})),0)])],1)])},h=[],g={data:function(){return{trackData:"",activityData:[{icon:"ri-edit-2-fill",date:"28 Apr, 2020 ",time:"12:07 am",title:"用户user提交了基线检测"},{icon:"ri-user-2-fill",date:"21 Apr, 2020 ",time:"08:01 pm",title:"用户Admin提交了计算机基础信息检测"},{icon:"ri-bar-chart-fill",date:"17 Apr, 2020 ",time:"05:10 pm",title:"用户Homage提交了端口扫描检测任务"},{icon:"ri-calendar-2-fill",date:"07 Apr, 2020",time:"12:47 pm",title:"用户Hact提交了自启动项服务检测任务"},{icon:"ri-edit-2-fill",date:"05 Apr, 2020 ",time:"03:09 pm",title:"用户Hact提交了自启动项服务检测任务"},{icon:"ri-user-2-fill",date:"02 Apr, 2020 ",time:"12:07 am",title:"用户Hact提交了自启动项服务检测任务"}]}},methods:{getTrack:function(){var e=this;d.a.get("http://127.0.0.1:8848/tasks/selectAll").then((function(t){console.log("获取所有结果: "+t),e.trackData=t.data.list})).catch((function(e){console.log(e)}))}},created:function(){this.getTrack()}},y=g,C=Object(v["a"])(y,b,h,!1,null,null,null),w=C.exports,S=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("div",{staticClass:"card"},[a("div",{staticClass:"card-body"},[a("b-dropdown",{staticClass:"float-right",attrs:{right:"","toggle-class":"arrow-none card-drop",variant:"white"},scopedSlots:e._u([{key:"button-content",fn:function(){return[a("i",{staticClass:"mdi mdi-dots-vertical"})]},proxy:!0}])}),a("h4",{staticClass:"card-title mb-4",staticStyle:{"font-size":"20px"}},[e._v("检测结果样例")]),a("div",{staticClass:"row mt-4"},[a("div",{staticClass:"col-sm-12 col-md-6"},[a("div",{staticClass:"dataTables_length",attrs:{id:"tickets-table_length"}},[a("label",{staticClass:"d-inline-flex align-items-center"},[e._v(" Show  "),a("b-form-select",{attrs:{size:"sm",options:e.pageOptions},model:{value:e.perPage,callback:function(t){e.perPage=t},expression:"perPage"}}),e._v(" entries ")],1)])]),a("div",{staticClass:"col-sm-12 col-md-6"},[a("div",{staticClass:"dataTables_filter text-md-right",attrs:{id:"tickets-table_filter"}},[a("label",{staticClass:"d-inline-flex align-items-center"},[e._v(" Search: "),a("b-form-input",{staticClass:"form-control form-control-sm ml-2",attrs:{type:"search"},model:{value:e.filter,callback:function(t){e.filter=t},expression:"filter"}})],1)])])]),a("div",{staticClass:"table-responsive"},[a("b-table",{attrs:{items:e.transactionData,fields:e.fields,responsive:"sm","per-page":e.perPage,"current-page":e.currentPage,"sort-by":e.sortBy,"sort-desc":e.sortDesc,filter:e.filter,"filter-included-fields":e.filterOn},on:{"update:sortBy":function(t){e.sortBy=t},"update:sort-by":function(t){e.sortBy=t},"update:sortDesc":function(t){e.sortDesc=t},"update:sort-desc":function(t){e.sortDesc=t},filtered:e.onFiltered},scopedSlots:e._u([{key:"cell(paymentstatus)",fn:function(t){return[a("div",{staticClass:"badge font-size-12",class:{"badge-soft-danger":""+t.value==="高风险","badge-soft-warning":""+t.value==="中风险","badge-soft-success":""+t.value==="低风险"}},[e._v(e._s(t.value))])]}},{key:"cell(action)",fn:function(){return[a("a",{directives:[{name:"b-tooltip",rawName:"v-b-tooltip.hover",modifiers:{hover:!0}}],staticClass:"mr-3 text-primary",attrs:{"data-toggle":"tooltip",title:"Edit"},on:{click:function(t){return e.goProfile()}}},[a("i",{staticClass:"mdi mdi-pencil font-size-18"})])]},proxy:!0}])})],1),a("div",{staticClass:"row"},[a("div",{staticClass:"col"},[a("div",{staticClass:"dataTables_paginate paging_simple_numbers float-right"},[a("ul",{staticClass:"pagination pagination-rounded mb-0"},[a("b-pagination",{attrs:{"total-rows":e.rows,"per-page":e.perPage},model:{value:e.currentPage,callback:function(t){e.currentPage=t},expression:"currentPage"}})],1)])])])],1)])},x=[],_={data:function(){return{transactionData:[{orderid:"#基线检测结果",date:"28 Mar, 2020",billingname:"Windows 10",total:"164",paymentstatus:"中风险",taskid:""},{orderid:"#基线检测结果",date:"28 Mar, 2020",billingname:"Windows Server 2008",total:"141",paymentstatus:"低风险",taskid:""},{orderid:"#主机基本信息检测",date:"29 Mar, 2020",billingname:"Window 10",total:"24",paymentstatus:"低风险",taskid:""},{orderid:"#主机服务检测",date:"30 Mar, 2020",billingname:"Windows 10",total:"44",paymentstatus:"低风险",taskid:""},{orderid:"#主机服务检测",date:"31 Mar, 2020",billingname:"Windows Server 2008",total:"49",paymentstatus:"中风险",taskid:""},{orderid:"#主机基本信息检测",date:"01 Apr, 2020",billingname:"Windows Server 2008",total:"160",paymentstatus:"高风险",taskid:""},{orderid:"#主机基本信息检测",date:"01 Apr, 2020",billingname:"Windows Server 2008",total:"160",paymentstatus:"高风险",taskid:""},{orderid:"#主机服务检测",date:"30 Mar, 2020",billingname:"Windows 10",total:"44",paymentstatus:"低风险",taskid:""},{orderid:"#主机服务检测",date:"30 Mar, 2020",billingname:"Windows 10",total:"44",paymentstatus:"低风险",taskid:""}],totalRows:1,currentPage:1,perPage:5,pageOptions:[5,10,25,50],filter:null,filterOn:[],sortBy:"orderid",sortDesc:!1,fields:[{key:"orderid",sortable:!0,label:"检测项目"},{key:"date",sortable:!0},{key:"billingname",sortable:!0,label:"检测主机"},{key:"total",sortable:!0,label:"总条目数"},{key:"paymentstatus",sortable:!0,label:"安全状态"},{key:"action",label:"查看"}]}},computed:{rows:function(){return this.transactionData.length}},mounted:function(){this.totalRows=this.transactionData.length},methods:{onFiltered:function(e){this.totalRows=e.length,this.currentPage=1},goProfile:function(){this.$router.push("/check_result")}}},k=_,P=Object(v["a"])(k,S,x,!1,null,null,null),A=P.exports,D=function(){var e=this,t=e.$createElement;e._self._c;return e._m(0)},z=[function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("div",{staticClass:"card"},[a("div",{staticClass:"card-body"},[a("div",{staticClass:"row"},[a("h3",{staticClass:"card-title mb-4 text-muted",staticStyle:{"font-size":"20px"}},[e._v("主机风险等级分布")]),a("div",{staticClass:"pie-wrap",staticStyle:{width:"100%",height:"550px"},attrs:{id:"chartPie"}})])])])}],M=a("313e");a("817d");var W={data:function(){return{chartPie:null}},mounted:function(){var e=this;this.$nextTick((function(){e.drawPieChart()}))},methods:{drawPieChart:function(){this.chartPie=M["init"](document.getElementById("chartPie"),"macarons"),this.chartPie.setOption({legend:{top:"bottom"},toolbox:{show:!0,feature:{mark:{show:!0},dataView:{show:!0,readOnly:!1},restore:{show:!0},saveAsImage:{show:!0}}},series:[{name:"面积模式",type:"pie",radius:[50,200],center:["50%","50%"],roseType:"area",color:["#ee6666","#fc8452","#5470c6","#91cc75"],itemStyle:{borderRadius:16},data:[{value:70,name:"非常危险"},{value:38,name:"比较危险"},{value:20,name:"比较安全"},{value:6,name:"安全"}]}],textStyle:{fontSize:16}})}}},T=W,E=Object(v["a"])(T,D,z,!1,null,null,null),L=E.exports,O=function(){var e=this,t=e.$createElement;e._self._c;return e._m(0)},R=[function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("div",{staticClass:"card"},[a("div",{staticClass:"card-body"},[a("div",{staticClass:"row"},[a("div",{staticClass:"pie-wrap",staticStyle:{width:"100%",height:"900px"},attrs:{id:"treePie"}})])])])}];a("817d");var B={name:"基线配置风险排行",children:[{name:"高风险项",children:[{name:"本地策略",children:[{name:"强制密码历史",value:10},{name:"密码最长使用期限",value:10},{name:"密码长度最小值",value:10},{name:"密码必须符合复杂性要求",value:10},{name:"账户锁定时间",value:10},{name:"审核登录事件",value:10},{name:"审核账户管理",value:10},{name:"审核账户登录事件",value:10}]},{name:"Windows防火墙",children:[{name:"域控制器: 允许服务器操作者计划任务",value:10},{name:"域控制器: LDAP 服务器签名要求",value:10},{name:"域控制器: 拒绝计算机帐户密码更改",value:10}]},{name:"网络控制",children:[{name:"网络访问: 不允许存储网络身份验证的密码和凭据",value:10},{name:"网络访问：可远程访问的注册表路径",value:10},{name:"网络安全: 在下一次更改密码时不存储 LAN 管理器哈希值",value:10},{name:"网络安全: 在超过登录时间后强制注销",value:10}]}]},{name:"中风险项",children:[{name:"本地策略",children:[{name:"用可还原的加密来储存密码",value:8},{name:"账户锁定阈值",value:8},{name:"作为受信任的呼叫方访问凭据管理器",value:8},{name:"从网络访问此计算机",value:8},{name:"以操作系统方式执行",value:8},{name:"为进程调整内存配额",value:8},{name:"允许通过远程桌面登录",value:8},{name:"创建一个令牌对象",value:8},{name:"创建全局对象",value:8},{name:"创建永久共享对象",value:8},{name:"调试程序",value:8},{name:"修改固件环境值",value:8}]},{name:"账户登录设置",children:[{name:"拒绝作为服务登录",value:8},{name:"信任计算机和用户帐户可以执行委派",value:8},{name:"账户：管理员账户状态",value:8},{name:"帐户: 来宾帐户状态",value:8},{name:"账户：重命名系统管理员账户",value:8},{name:"账户：重命名来宾账户",value:8},{name:"审核：强制审核策略子类别设置(Windows Visita或更高版本)替代审核策略类别设置",value:8}]},{name:"网络控制",children:[{name:"Microsoft 网络客户端：对通信进行数字签名（始终）",value:8},{name:"Microsoft网络客户端：对通信进行数字签名(如果服务器允许）",value:8},{name:"Microsoft网络客户端：将未加密的密码发送到第三方SMB服务器",value:8},{name:"Microsoft 网络服务器: 对通信进行数字签名(始终)",value:8}]}]},{name:"低风险项",children:[{name:"交互登录:无须按Ctrl+Alt+Del",value:5},{name:"交互式登录: 不显示最后的用户名",value:5},{name:"交互式登录: 在过期前提示用户更改密码\n",value:5},{name:"交互式登录: 需要域控制器身份验证以对工作站进行解锁",value:5},{name:"网络访问: 允许匿名 SID/名称转换",value:5},{name:"网络访问: 不允许存储网络身份验证的密码和凭据",value:5},{name:"网络安全: 在超过登录时间后强制注销",value:5},{name:"关机: 允许系统在未登录的情况下关闭",value:5},{name:"系统对象: 非 Windows 子系统不要求区分大小写",value:5},{name:"用户帐户控制: 对内置管理员帐户使用管理审批模式",value:5},{name:"系统设置: 可选子系统",value:5},{name:"网络访问: 将 Everyone 权限应用于匿名用户",value:5},{name:"执行卷维护任务",value:5},{name:"配置文件单一进程",value:5},{name:"配置文件系统性能",value:5},{name:"关闭系统",value:5},{name:"同步目录服务数据",value:5},{name:"提高计划优先级",value:5},{name:"加载和卸载设备驱动",value:5},{name:"创建符号链接",value:5},{name:"创建一个页面文件",value:5},{name:"重置账户锁定计数器",value:5},{name:"审核登录事件",value:5},{name:"将工作站添加到域",value:5}]},{name:"微风险项",children:[{name:"设备: 允许对可移动媒体进行格式化并弹出",value:2},{name:"设备: 防止用户安装打印机驱动程序",value:2},{name:"域成员：对安全通道数据进行数字加密（如果可能）",value:2},{name:"域成员：对安全通道数据进行数字加密或数字签名（始终）",value:2},{name:"系统设置: 可选子系统",value:2},{name:"系统对象: 非 Windows 子系统不要求区分大小写",value:2},{name:"用户帐户控制:提示提升时切换到安全桌面",value:2},{name:"用户帐户控制:将文件和注册表写入错误虚拟化到每用户位置",value:2},{name:"用户帐户控制:仅提升安装在安全位置的UIAccess应用程序",value:2},{name:"用户帐户控制: 标准用户的提升提示行为",value:2}]}]},$={name:"服务配置风险排行",children:[{name:"高风险",children:[{name:"Browser",value:8},{name:"FTPSVC",value:8},{name:"InstallService",value:8},{name:"bthserv",value:8},{name:"irmon",value:8},{name:"LanmanServer",value:8},{name:"MapsBroker",value:8},{name:"p2pimsvc",value:8},{name:"p2psvc",value:8},{name:"PNRPsvc",value:8},{name:"SNMP",value:8}]},{name:"中风险",children:[{name:"SSDPSRV",value:5},{name:"sshd",value:5},{name:"TermService",value:5},{name:"UmRdpService",value:5},{name:"upnphost",value:5},{name:"W3SVC",value:5},{name:"WMPNetworkSvc",value:5},{name:"WinRM",value:4},{name:"wercplsupport",value:6},{name:"TimeScale",value:5}]},{name:"低风险",children:[{name:"XblGameSave",value:2},{name:"XboxNetApiSvc",value:3},{name:"XboxGipSvc",value:2},{name:"XblAuthManager",value:1},{name:"RpcLocator",value:2},{name:"BTAGService",value:2}]}]},I={data:function(){return{treePie:null}},mounted:function(){var e=this;this.$nextTick((function(){e.drawPieChart()}))},methods:{drawPieChart:function(){this.treePie=M["init"](document.getElementById("treePie"),"macarons"),this.treePie.hideLoading(),this.treePie.setOption({tooltip:{trigger:"item",triggerOn:"mousemove"},textStyle:{fontSize:16},legend:{top:"2%",left:"3%",orient:"vertical",data:[{name:"基线配置风险排行",icon:"rectangle"},{name:"服务配置风险排行",icon:"rectangle"}],borderColor:"#c23531"},series:[{type:"tree",name:"基线配置风险排行",data:[B],top:"5%",left:"8%",bottom:"2%",right:"60%",symbolSize:10,label:{position:"left",verticalAlign:"middle",align:"right"},leaves:{label:{position:"right",verticalAlign:"middle",align:"left"}},emphasis:{focus:"descendant"},expandAndCollapse:!0,animationDuration:750,animationDurationUpdate:950},{type:"tree",name:"服务配置风险排行",data:[$],top:"20%",left:"70%",bottom:"22%",right:"20%",symbolSize:10,label:{position:"left",verticalAlign:"middle",align:"right"},leaves:{label:{position:"right",verticalAlign:"middle",align:"left"}},expandAndCollapse:!0,emphasis:{focus:"descendant"},animationDuration:750,animationDurationUpdate:950}]})}}},N=I,j=Object(v["a"])(N,O,R,!1,null,null,null),H=j.exports,V={components:{Layout:n["a"],PageHeader:s["a"],ShowCount:f,RecentActivity:w,CheckExample:A,Pie:L,Tree:H},data:function(){return{title:"基线核查数据统计",items:[{text:"主页"},{text:"",active:!0}]}}},F=V,U=Object(v["a"])(F,i,l,!1,null,null,null);t["default"]=U.exports},"817d":function(e,t,a){var i,l,n;(function(s,r){l=[t,a("313e")],i=r,n="function"===typeof i?i.apply(t,l):i,void 0===n||(e.exports=n)})(0,(function(e,t){var a=function(e){"undefined"!==typeof console&&console&&console.error&&console.error(e)};if(t){var i=["#2ec7c9","#b6a2de","#5ab1ef","#ffb980","#d87a80","#8d98b3","#e5cf0d","#97b552","#95706d","#dc69aa","#07a2a4","#9a7fd1","#588dd5","#f5994e","#c05050","#59678c","#c9ab00","#7eb00a","#6f5553","#c14089"],l={color:i,title:{textStyle:{fontWeight:"normal",color:"#008acd"}},visualMap:{itemWidth:15,color:["#5ab1ef","#e0ffff"]},toolbox:{iconStyle:{normal:{borderColor:i[0]}}},tooltip:{backgroundColor:"rgba(50,50,50,0.5)",axisPointer:{type:"line",lineStyle:{color:"#008acd"},crossStyle:{color:"#008acd"},shadowStyle:{color:"rgba(200,200,200,0.2)"}}},dataZoom:{dataBackgroundColor:"#efefff",fillerColor:"rgba(182,162,222,0.2)",handleColor:"#008acd"},grid:{borderColor:"#eee"},categoryAxis:{axisLine:{lineStyle:{color:"#008acd"}},splitLine:{lineStyle:{color:["#eee"]}}},valueAxis:{axisLine:{lineStyle:{color:"#008acd"}},splitArea:{show:!0,areaStyle:{color:["rgba(250,250,250,0.1)","rgba(200,200,200,0.1)"]}},splitLine:{lineStyle:{color:["#eee"]}}},timeline:{lineStyle:{color:"#008acd"},controlStyle:{color:"#008acd",borderColor:"#008acd"},symbol:"emptyCircle",symbolSize:3},line:{smooth:!0,symbol:"emptyCircle",symbolSize:3},candlestick:{itemStyle:{color:"#d87a80",color0:"#2ec7c9"},lineStyle:{width:1,color:"#d87a80",color0:"#2ec7c9"},areaStyle:{color:"#2ec7c9",color0:"#b6a2de"}},scatter:{symbol:"circle",symbolSize:4},map:{itemStyle:{color:"#ddd"},areaStyle:{color:"#fe994e"},label:{color:"#d87a80"}},graph:{itemStyle:{color:"#d87a80"},linkStyle:{color:"#2ec7c9"}},gauge:{axisLine:{lineStyle:{color:[[.2,"#2ec7c9"],[.8,"#5ab1ef"],[1,"#d87a80"]],width:10}},axisTick:{splitNumber:10,length:15,lineStyle:{color:"auto"}},splitLine:{length:22,lineStyle:{color:"auto"}},pointer:{width:5}}};t.registerTheme("macarons",l)}else a("ECharts is not Loaded")}))}}]);
//# sourceMappingURL=chunk-3ae526ea.66d379bd.js.map