package io.rancher;

import io.rancher.RancherClient.Config;
import io.rancher.base.Filters;
import io.rancher.service.ClusterService;
import io.rancher.service.NodeService;
import io.rancher.service.ProjectService;
import io.rancher.service.project.*;
import io.rancher.type.Cluster;
import io.rancher.type.Node;
import io.rancher.type.Project;
import io.rancher.type.project.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class RancherUtils {

    private static final Logger logger = LogManager.getLogger(RancherUtils.class);

    static ConcurrentMap<String, RancherUtils> RANCHERSMAP = new ConcurrentHashMap<>();

    private RancherClient client;

    private RancherUtils(RancherClient client) {
        this.client = client;
    }

    public RancherClient getClient() {
        return client;
    }

    public void setClient(RancherClient client) {
        this.client = client;
    }

    public String info() {
        return client != null ? "apis:" + client.getUrl() : null;
    }

    public String apiAddress() {
        return client != null ? client.getUrl() : null;
    }

    public void deleteRancherUtils(Config config) {
        if (config == null || !config.verify()) {
            logger.error("rancher connection config error!");
            return;
        }
        RANCHERSMAP.remove(config.getUrl().toString());
        RANCHERSMAP.remove(config.md5Key());
    }

    public static RancherUtils buildUtils(Config config) {
        if (config == null || !config.verify()) {
            logger.error("rancher connection config error!");
            return null;
        }
        String key = config.md5Key();
        if (RANCHERSMAP.containsKey(key)) {
            return RANCHERSMAP.get(key);
        }
        RancherClient rancherClient = new RancherClient(config);
        return new RancherUtils(rancherClient);
    }

    public List<Node> listNode(String clusterId) throws IOException {
        Filters filters = new Filters();
        filters.put("clusterId", clusterId);
        NodeService nodeService = client.type(NodeService.class);
        return nodeService.list(filters).execute().body().getData();
    }

    public List<Cluster> listCluster() throws IOException {
        ClusterService clusterService = client.type(ClusterService.class);
        return clusterService.list().execute().body().getData();
    }

    public void createCluster(Cluster cluster) throws IOException {
        ClusterService clusterService = client.type(ClusterService.class);
        if (clusterService.create(cluster).execute().isSuccessful()) {
            logger.info("create Cluster successfully!");
        } else {
            logger.error("create Cluster failed!");
        }
    }

    public List<Project> listProject() throws IOException {
        ProjectService projectService = client.type(ProjectService.class);
        return projectService.list().execute().body().getData();
    }

    public void createProject(Project project) throws IOException {
        ProjectService projectService = client.type(ProjectService.class);
        if (projectService.create(project).execute().isSuccessful()) {
            logger.info("create Project successfully!");
        } else {
            logger.error("create Project failed!");
        }
    }

    public List<Project> listProjectByClusterId(String clusterId) throws IOException {
        Filters filters = new Filters();
        filters.put("clusterId", clusterId);
        ProjectService projectService = client.type(ProjectService.class);
        return projectService.list(filters).execute().body().getData();
    }

    public List<Pod> listPod(String projectId) throws IOException {
        Filters filters = new Filters();
        filters.put("projectId", projectId);
        PodService podService = client.type(PodService.class);
        return podService.list(filters).execute().body().getData();
    }

    public void createPod(Pod pod) throws IOException {
        PodService podService = client.type(PodService.class);
        if (podService.create(pod).execute().isSuccessful()) {
            logger.info("create Pod successfully!");
        } else {
            logger.error("create Pod failed!");
        }
    }

    public List<Workload> listWorkload(String projectId) throws IOException {
        Filters filters = new Filters();
        filters.put("projectId", projectId);
        WorkloadService workloadService = client.type(WorkloadService.class);
        return workloadService.list(filters).execute().body().getData();
    }

    public void createWorkload(Workload workload) throws IOException {
        WorkloadService workloadService = client.type(WorkloadService.class);
        if (workloadService.create(workload).execute().isSuccessful()) {
            logger.info("create Workload successfully!");
        } else {
            logger.error("create Workload failed!");
        }
    }

    public List<Ingress> listIngress(String projectId) throws IOException {
        Filters filters = new Filters();
        filters.put("projectId", projectId);
        IngressService ingressService = client.type(IngressService.class);
        return ingressService.list(filters).execute().body().getData();
    }

    public void createIngress(Ingress ingress) throws IOException {
        IngressService ingressService = client.type(IngressService.class);
        if (ingressService.create(ingress).execute().isSuccessful()) {
            logger.info("create Ingress successfully!");
        } else {
            logger.error("create Ingress failed!");
        }
    }

    public List<ConfigMap> listConfigMap(String projectId) throws IOException {
        Filters filters = new Filters();
        filters.put("projectId", projectId);
        ConfigMapService configMapService = client.type(ConfigMapService.class);
        return configMapService.list(filters).execute().body().getData();
    }

    public void createConfigMap(ConfigMap configMap) throws IOException {
        ConfigMapService configMapService = client.type(ConfigMapService.class);
        if (configMapService.create(configMap).execute().isSuccessful()) {
            logger.info("create ConfigMap successfully!");
        } else {
            logger.error("create ConfigMap failed!");
        }
    }

    public List<Deployment> listDeployment(String projectId) throws IOException {
        Filters filters = new Filters();
        filters.put("projectId", projectId);
        DeploymentService deploymentService = client.type(DeploymentService.class);
        return deploymentService.list(filters).execute().body().getData();
    }

    public void createDeployment(Deployment deployment) throws IOException {
        DeploymentService deploymentService = client.type(DeploymentService.class);
        if (deploymentService.create(deployment).execute().isSuccessful()) {
            logger.info("create Deployment successfully!");
        } else {
            logger.error("create Deployment failed!");
        }
    }

    public List<DaemonSet> listDaemonSet(String projectId) throws IOException {
        Filters filters = new Filters();
        filters.put("projectId", projectId);
        DaemonSetService daemonSetService = client.type(DaemonSetService.class);
        return daemonSetService.list(filters).execute().body().getData();
    }

    public void createDaemonSet(DaemonSet daemonSet) throws IOException {
        DaemonSetService daemonSetService = client.type(DaemonSetService.class);
        if (daemonSetService.create(daemonSet).execute().isSuccessful()) {
            logger.info("create DaemonSet successfully!");
        } else {
            logger.error("create DaemonSet failed!");
        }
    }

    public List<ReplicaSet> listReplicaSet(String projectId) throws IOException {
        Filters filters = new Filters();
        filters.put("projectId", projectId);
        ReplicaSetService replicaSetService = client.type(ReplicaSetService.class);
        return replicaSetService.list(filters).execute().body().getData();
    }

    public void createReplicaSet(ReplicaSet replicaSet) throws IOException {
        ReplicaSetService replicaSetService = client.type(ReplicaSetService.class);
        if (replicaSetService.create(replicaSet).execute().isSuccessful()) {
            logger.info("create ReplicaSet successfully!");
        } else {
            logger.error("create ReplicaSet failed!");
        }
    }

    public List<StatefulSet> listStatefulSet(String projectId) throws IOException {
        Filters filters = new Filters();
        filters.put("projectId", projectId);
        StatefulSetService statefulSetService = client.type(StatefulSetService.class);
        return statefulSetService.list(filters).execute().body().getData();
    }

    public void createStatefulSet(StatefulSet statefulSet) throws IOException {
        StatefulSetService statefulSetService = client.type(StatefulSetService.class);
        if (statefulSetService.create(statefulSet).execute().isSuccessful()) {
            logger.info("create StatefulSet successfully!");
        } else {
            logger.error("create StatefulSet failed!");
        }
    }

    public List<Service> listService(String projectId) throws IOException {
        Filters filters = new Filters();
        filters.put("projectId", projectId);
        ServiceService serviceService = client.type(ServiceService.class);
        return serviceService.list(filters).execute().body().getData();
    }

    public void createService(Service service) throws IOException {
        ServiceService serviceService = client.type(ServiceService.class);
        if (serviceService.create(service).execute().isSuccessful()) {
            logger.info("create Service successfully!");
        } else {
            logger.error("create Service failed!");
        }
    }

    public List<Secret> listSecret(String projectId) throws IOException {
        Filters filters = new Filters();
        filters.put("projectId", projectId);
        SecretService secretService = client.type(SecretService.class);
        return secretService.list(filters).execute().body().getData();
    }

    public void createSecret(Secret secret) throws IOException {
        SecretService secretService = client.type(SecretService.class);
        if (secretService.create(secret).execute().isSuccessful()) {
            logger.info("create Secret successfully!");
        } else {
            logger.error("create Secret failed!");
        }
    }
}
