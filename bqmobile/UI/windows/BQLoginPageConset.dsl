<?xml version="1.0" encoding="UTF-8"?>

<window id="BQLoginPageconset" context="connectinfor" controller="BQLoginPageconsetController" namespace="com.yonyou">
    <import ref="BQLoginPageconset.css" type="css"/>
    <action port="#{port}" id="settingSave" host="#{ip}" ishttps="#{ishttps}" callback="closeWindow" isDataCollect="true" method="UMService.writeConfigure"/>
    <action id="closeWindow" viewid="com.yonyou.BQLoginPage" method="UMView.open" ishttps="#{ishttps}" isKeep="false" animation-type="Fade"/>
    <div id="viewPage0">
        <navigatorbar id="navigatorbar0">
            <label id="label0"/>
            <label id="label2">设置链接</label>
            <label id="label1"/> 
        </navigatorbar>
        <div id="panel0">
            <input id="textbox0" bindfield="ip" maxlength="256" value="merp.yonyou.com" type="text"/>
            <label id="label3"/>
            <input id="textbox1" bindfield="port" maxlength="256" value="8080" type="text"/> 
        </div>
        <div id="panel1">
            <label id="label4"/>
            <label id="label5">是否HTTPS</label>
            <switch id="switch0" bindfield="ishttps" value="off"/> 
        </div>
        <input id="button0" value="保 存" onclick="settingSave" type="button"/> 
    </div> 
</window>
