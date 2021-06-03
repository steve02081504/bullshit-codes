/**
 * [新增或修改功能，代码controller层和service层代码贴出来]
 * @version	1.0.0
 */
public class AddOrUpdate {
	
	public static void main(String[] args) {
		// 这里是controller层
		if (id != null){
			// service在下面
            return eqbTemplateBaseService.updateTemplateBase(templateBaseName,projectBaseId,projectBaseName,status,code,id,realName);
        }else{
        	// service在下面
            return eqbTemplateBaseService.addTemplateBase(templateBaseName,projectBaseId,projectBaseName,status,code,realName);
        }
	}
	
	// 这里是service层
	public ApiResponse addTemplateBase(String templateBaseName, Integer projectBaseId, String projectBaseName ,Integer status, String code,String  realName) {
    	AddTemplateBaseReq addTemplateBaseReq = new AddTemplateBaseReq();
        addTemplateBaseReq.setCode(code);
        addTemplateBaseReq.setProjectBaseId(projectBaseId);
        addTemplateBaseReq.setStatus(status);
        addTemplateBaseReq.setTemplateBaseName(templateBaseName);
        addTemplateBaseReq.setProjectBaseName(projectBaseName);
        addTemplateBaseReq.setRealName(realName);
        // 这里调另一个服务的接口
    	return eqbTemplateBaseClient.addTemplateBase(addTemplateBaseReq);
    }

	// 这里是service层
    public ApiResponse updateTemplateBase(String templateBaseName, Integer projectBaseId,String projectBaseName, Integer status, String code, Integer id,String realName) {
        UpdateTemplateBaseReq updateTemplateBaseReq = new UpdateTemplateBaseReq();
        updateTemplateBaseReq.setCode(code);
        updateTemplateBaseReq.setProjectBaseId(projectBaseId);
        updateTemplateBaseReq.setStatus(status);
        updateTemplateBaseReq.setTemplateBaseName(templateBaseName);
        updateTemplateBaseReq.setId(id);// 就为了这个id,写了两套
        updateTemplateBaseReq.setProjectBaseName(projectBaseName);
        updateTemplateBaseReq.setRealName(realName);
        // 这里调另一个服务的接口
        return eqbTemplateBaseClient.updateTemplateBase(updateTemplateBaseReq);
    }
    
    // 明明可以写成一个方法，这个兄弟倒好，整整写成了两套，后面eqbTemplateBaseClient相对应的两套还没有贴出来，那边才是真正的业务开始

}