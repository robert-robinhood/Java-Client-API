package com.sendsafely.dto.request;

import com.sendsafely.enums.GetParam;
import com.sendsafely.enums.HTTPMethod;
import com.sendsafely.json.JsonManager;

public class DeleteFileRequest extends BaseRequest {
	private HTTPMethod method = HTTPMethod.DELETE;
	private String path = "/package/" + GetParam.PACKAGE_ID + "/directory/" + GetParam.DIRECTORY_ID + "/file/"+GetParam.FILE_ID + "/";
	
	public DeleteFileRequest(JsonManager jsonManager) {
		initialize(jsonManager, method, path);
	}
	
	public void setPackageId(String packageId)
	{
		super.setGetParam(GetParam.PACKAGE_ID, packageId);
	}
	
	public void setDirectoryId(String directoryId){
		super.setGetParam(GetParam.DIRECTORY_ID, directoryId);
	}
	
	public void setFileId(String fileId){
		super.setGetParam(GetParam.FILE_ID, fileId);
	}
}
