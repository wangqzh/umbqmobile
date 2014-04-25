<?xml version="1.0" encoding="UTF-8"?>

<window id="BQLoginPage" context="USERS" controller="BQLoginPageController" namespace="com.ufida.uap">
    <import ref="BQLoginPage.css" type="css"/>
    <action id="loginAction" callback="openHTTPS" isDataCollect="true" method="UMService.login" type="nc" user="#{userName}" pass="#{passWord}"/>
    <action id="openMainview" viewid="com.yonyou.Personlist" method="UMView.open" isKeep="false" animation-type="Fade"/>
    <action id="connectSetting" viewid="com.yonyou.BQLoginPageconset" method="UMView.open" isKeep="false" animation-type="Fade"/>
    <action id="openHTTPS" ishttps="#{ishttps}" callback="openMainview" method="UMService.openHTTPS"/>
    <action id="loadconfig" ishttps="ishttps" callback="openHTTPS" method="UMService.loadConfigure"/>
    <div id="viewPageLogin">
        <navigatorbar id="navigatorbar0">
            <input id="button0" type="button"/>
            <label id="labelLoginTitle">用户登录</label>
            <input id="buttonConset" value="设置链接" onclick="connectSetting" type="button"/> 
        </navigatorbar>
        <input id="textboxUserName" bindfield="userName" maxlength="256" value="admin" type="text"/>
        <input id="textboxPassword" bindfield="passWord" maxlength="256" value="123456" type="password"/>
        <div id="panel0">
            <label id="label2"/>
            <label id="labelAutoLogin">自动登录</label>
            <switch id="switchAutoLogin" value="off"/> 
        </div>
        <input id="buttonLogin" onclick="loadconfig" type="button"/> 
    </div> 
</window>
