/*
 * Copyright (c) 2017, WSO2 Inc. (http://wso2.com) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.ballerinalang.containers.docker.bean;

/**
 * Contains details of a running Ballerina Service container.
 */
public class ServiceContainerConfiguration {
    private String containerId;
    private String exposedPort;
    private String runningUrl;

    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public String getExposedPort() {
        return exposedPort;
    }

    public void setExposedPort(String exposedPort) {
        this.exposedPort = exposedPort;
    }

    public String getRunningUrl() {
        return runningUrl;
    }

    public void setRunningUrl(String runningUrl) {
        this.runningUrl = runningUrl;
    }
}
