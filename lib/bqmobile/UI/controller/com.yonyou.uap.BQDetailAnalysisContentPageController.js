Type.registerNamespace('com.yonyou.uap.BQDetailAnalysisContentPageController');
com.yonyou.uap.BQDetailAnalysisContentPageController = function() {

}
function com$yonyou$uap$BQDetailAnalysisContentPageController$initialize(ctx){
    //your logic code below...
    //demo code : var companyEnity = ctx.entity();
    //demo code : var departmentEntity = companyEnity.field("depts");
    //demo code : var employeeEntity = departmentEntity.get("empls");
    //demo code : companyEnity.attachEvent("onchange", "name", onchange_handler1);
    //demo code : departmentEntity.attachEvent("onchange", "dname", onchange_handler2);
    //demo code : employeeEntity.attachEvent("onchange", "ename", onchange_handler3);
    //yon can attach event on the entity object...
    
}
function com$yonyou$uap$BQDetailAnalysisContentPageController$onBackForward(ctx){
    //your logic code below...
    //you can get the current context by $context or the parameter[ctx]
    //demo code : $context.get("a")
    //demo code : $context.get("cust").get("ca")
    //demo code : $context.get("lines").get(0,"la")
    //demo code : $context.get("lines").get(0,"details").get(0,"da")
	var request = "{viewid:'com.yonyou.uap.BQFramePage'}";
	$service.call ("UMView.open", request);
}
com.yonyou.uap.BQDetailAnalysisContentPageController.prototype = {
    initialize : com$yonyou$uap$BQDetailAnalysisContentPageController$initialize,
    onBackForward : com$yonyou$uap$BQDetailAnalysisContentPageController$onBackForward
};
com.yonyou.uap.BQDetailAnalysisContentPageController.registerClass('com.yonyou.uap.BQDetailAnalysisContentPageController');
