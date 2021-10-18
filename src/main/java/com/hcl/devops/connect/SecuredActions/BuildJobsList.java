package com.hcl.devops.connect.SecuredActions;

import com.hcl.devops.connect.CloudItemListener;

public class BuildJobsList extends AbstractSecuredAction {

    protected void run(AbstractSecuredAction.ParamObj paramObj) {
        CloudItemListener cil = new CloudItemListener();
        cil.buildJobsList();
    }

    public class BuildJobListParamObj extends AbstractSecuredAction.ParamObj {

        public BuildJobListParamObj() {
        }
    }
}
