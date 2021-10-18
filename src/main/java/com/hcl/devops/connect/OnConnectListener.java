package com.hcl.devops.connect;

import com.hcl.devops.connect.SecuredActions.BuildJobsList;
import com.hcl.devops.connect.SecuredActions.BuildJobsList.BuildJobListParamObj;
import com.ibm.cloud.urbancode.connect.client.ConnectSocket;
import com.ibm.cloud.urbancode.connect.client.Listener;

public class OnConnectListener {
    static final public Listener BUILD_JOBS_LIST = new Listener() {
        @Override
        public void call(ConnectSocket socket, String event, Object... args) {
            BuildJobsList buildJobList = new BuildJobsList();
            BuildJobListParamObj paramObj = buildJobList.new BuildJobListParamObj();
            buildJobList.runAsJenkinsUser(paramObj);
        }
    };
}
