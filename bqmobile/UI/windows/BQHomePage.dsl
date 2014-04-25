<?xml version="1.0" encoding="UTF-8"?>

<window id="BQHomePage" controller="BQHomePageController" namespace="com.ufida.uap">
    <import ref="BQHomePage.css" type="css"/>
    <import ref="BQMenuView.w" type="widget"/>
    <import ref="BQFaverateView.w" type="widget"/>
    <div id="viewPage0">
        <slidingView id="slidingViewHome" mainview="mainWgt" rightview="rightWgt">
            <widget id="mainWgt" ref="BQMenuView"/>
            <widget id="rightWgt" ref="BQFaverateView"/> 
        </slidingView> 
    </div> 
</window>
