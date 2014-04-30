Type.registerNamespace('com.yonyou.uap.BQFramePageController');
com.yonyou.uap.BQFramePageController = function() {

}
function com$yonyou$uap$BQFramePageController$initialize(ctx){
    //your logic code below...
    //demo code : var companyEnity = ctx.entity();
    //demo code : var departmentEntity = companyEnity.field("depts");
    //demo code : var employeeEntity = departmentEntity.get("empls");
    //demo code : companyEnity.attachEvent("onchange", "name", onchange_handler1);
    //demo code : departmentEntity.attachEvent("onchange", "dname", onchange_handler2);
    //demo code : employeeEntity.attachEvent("onchange", "ename", onchange_handler3);
    //yon can attach event on the entity object...
    
}
function com$yonyou$uap$BQFramePageController$jsCallbackLoadData(ctx){
    //your logic code below...
    //you can get the current context by $context or the parameter[ctx]
    //demo code : $context.get("a")
    //demo code : $context.get("cust").get("ca")
    //demo code : $context.get("lines").get(0,"la")
    //demo code : $context.get("lines").get(0,"details").get(0,"da")

}
function com$yonyou$uap$BQFramePageController$onOpenAllWorksheet(ctx){
    //your logic code below...
    //you can get the current context by $context or the parameter[ctx]
    //demo code : $context.get("a")
    //demo code : $context.get("cust").get("ca")
    //demo code : $context.get("lines").get(0,"la")
    //demo code : $context.get("lines").get(0,"details").get(0,"da")

}
function com$yonyou$uap$BQFramePageController$onOpenMyWorksheet(ctx){
    //your logic code below...
    //you can get the current context by $context or the parameter[ctx]
    //demo code : $context.get("a")
    //demo code : $context.get("cust").get("ca")
    //demo code : $context.get("lines").get(0,"la")
    //demo code : $context.get("lines").get(0,"details").get(0,"da")

}
com.yonyou.uap.BQFramePageController.prototype = {
    initialize : com$yonyou$uap$BQFramePageController$initialize,
    jsCallbackLoadData : com$yonyou$uap$BQFramePageController$jsCallbackLoadData,
    onOpenAllWorksheet : com$yonyou$uap$BQFramePageController$onOpenAllWorksheet,
    onOpenMyWorksheet : com$yonyou$uap$BQFramePageController$onOpenMyWorksheet
};
com.yonyou.uap.BQFramePageController.registerClass('com.yonyou.uap.BQFramePageController');
