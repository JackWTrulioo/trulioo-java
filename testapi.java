import com.trulioo.normalizedapi.*;
import com.trulioo.normalizedapi.api.*;
import com.trulioo.normalizedapi.model.*;

//Set client here
ApiClient apiClient = new ApiClient();
apiClient.setUsername("WebullAPI");
apiClient.setPassword("-- PASSWORD --");

//ConnectionApi
ConnectionApi connectionClient = new ConnectionApi(apiClient);

//testAuthentication
String testResult = connectionClient.testAuthentication();
System.out.println(testResult);
        
//testAuthenticationAsync
connectionClient.testAuthenticationAsync(new ApiCallback<String>() {
	@Override
	public void onFailure(ApiException ae, int i, Map<String, List<String>> map) {
		Logger.getLogger(SdkJavaV1Sample.class.getName()).log(Level.SEVERE, null, ae);
	}
	
	@Override
	public void onSuccess(String t, int i, Map<String, List<String>> map) {
		System.out.println(t);
	}
	
	@Override
	public void onUploadProgress(long l, long l1, boolean bln) {
		//To change body of generated methods, choose Tools | Templates.
	}
	
	@Override
	public void onDownloadProgress(long l, long l1, boolean bln) {
		//To change body of generated methods, choose Tools | Templates.
	}
});