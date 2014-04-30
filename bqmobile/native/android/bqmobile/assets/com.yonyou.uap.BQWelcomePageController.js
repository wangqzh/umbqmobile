Type.registerNamespace('com.yonyou.uap.BQWelcomePageController');
com.yonyou.uap.BQWelcomePageController = function() {

}
function com$yonyou$uap$BQWelcomePageController$initialize(ctx){
    //your logic code below...
    //demo code : var companyEnity = ctx.entity();
    //demo code : var departmentEntity = companyEnity.field("depts");
    //demo code : var employeeEntity = departmentEntity.get("empls");
    //demo code : companyEnity.attachEvent("onchange", "name", onchange_handler1);
    //demo code : departmentEntity.attachEvent("onchange", "dname", onchange_handler2);
    //demo code : employeeEntity.attachEvent("onchange", "ename", onchange_handler3);
    //yon can attach event on the entity object...
    
}
function com$yonyou$uap$BQWelcomePageController$afterDesplay(ctx){
    //your logic code below...
    //you can get the current context by $context or the parameter[ctx]
    //demo code : $context.get("a")
    //demo code : $context.get("cust").get("ca")
    //demo code : $context.get("lines").get(0,"la")
    //demo code : $context.get("lines").get(0,"details").get(0,"da")
    var json = "{\"viewid\":\"com.yonyou.uap.BQLoginPage\"}";
    $service.call("UMView.open",json);
}
com.yonyou.uap.BQWelcomePageController.prototype = {
    initialize : com$yonyou$uap$BQWelcomePageController$initialize,
    afterDesplay : com$yonyou$uap$BQWelcomePageController$afterDesplay
};
com.yonyou.uap.BQWelcomePageController.registerClass('com.yonyou.uap.BQWelcomePageController');
