Type.registerNamespace('com.yonyou.uap.BQDetailAnalysisContentPageControllerBase');
com.yonyou.uap.BQDetailAnalysisContentPageControllerBase = function() {
    //Step 1锛歩nherit the base class
    com.yonyou.uap.BQDetailAnalysisContentPageControllerBase.initializeBase(this);

    //Auto generate action map...
    this._actionMap = {
        onBackForward : [this.onBackForward]
    };

    //user controller instance
    this._userController = new com.yonyou.uap.BQDetailAnalysisContentPageController();

    //the window[BQDetailAnalysisContentPage] do not define the context
    this._entity = null;
    this._context = null;
}
function com$yonyou$uap$BQDetailAnalysisContentPageControllerBase$onBackForward(json){
    try{
    	//when every action begin,  json-->$context
    	this._context = _$um$CRUD$load(this._context, json, this._entity);
    	if(this._context){
    	    $context = this._context;//
    	}else{
    	    $context = json;//compatible with the old code
    	}
    	    
        if(this._userController.initialize)
            this._userController.initialize();
        this._userController.onBackForward($context);
    	
    	//when every action end,  $context-->json
    	if(this._context == null){//compatible with the old code
    	    return $context;
    	}
    	var newjson = _$um$CRUD$Context2JSON($context);
    	return newjson;
    }catch(e){
        alert(e.stack);
    }
    return json;
}
com.yonyou.uap.BQDetailAnalysisContentPageControllerBase.prototype = {
    onBackForward : com$yonyou$uap$BQDetailAnalysisContentPageControllerBase$onBackForward
};
com.yonyou.uap.BQDetailAnalysisContentPageControllerBase.registerClass('com.yonyou.uap.BQDetailAnalysisContentPageControllerBase',UMP.UI.Mvc.Controller);
