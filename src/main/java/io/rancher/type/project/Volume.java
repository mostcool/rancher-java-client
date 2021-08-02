package io.rancher.type.project;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Volume extends AbstractType {

    @JsonProperty("awsElasticBlockStore")
    private AwsElasticBlockStoreVolumeSource awsElasticBlockStore;

    @JsonProperty("azureDisk")
    private AzureDiskVolumeSource azureDisk;

    @JsonProperty("azureFile")
    private AzureFileVolumeSource azureFile;

    @JsonProperty("cephfs")
    private CephFSVolumeSource cephfs;

    @JsonProperty("cinder")
    private CinderVolumeSource cinder;

    @JsonProperty("configMap")
    private ConfigMapVolumeSource configMap;

    @JsonProperty("csi")
    private CsiVolumeSource csi;

    @JsonProperty("downwardAPI")
    private DownwardAPIVolumeSource downwardApi;

    @JsonProperty("emptyDir")
    private EmptyDirVolumeSource emptyDir;

    @JsonProperty("fc")
    private FcVolumeSource fc;

    @JsonProperty("flexVolume")
    private FlexVolumeSource flexVolume;

    @JsonProperty("flocker")
    private FlockerVolumeSource flocker;

    @JsonProperty("gcePersistentDisk")
    private GcePersistentDiskVolumeSource gcePersistentDisk;

    @JsonProperty("gitRepo")
    private GitRepoVolumeSource gitRepo;

    @JsonProperty("glusterfs")
    private GlusterfsVolumeSource glusterfs;

    @JsonProperty("hostPath")
    private HostPathVolumeSource hostPath;

    @JsonProperty("iscsi")
    private IscsiVolumeSource iscsi;

    @JsonProperty("name")
    private String name;

    @JsonProperty("nfs")
    private NfsVolumeSource nfs;

    @JsonProperty("persistentVolumeClaim")
    private PersistentVolumeClaimVolumeSource persistentVolumeClaim;

    @JsonProperty("photonPersistentDisk")
    private PhotonPersistentDiskVolumeSource photonPersistentDisk;

    @JsonProperty("portworxVolume")
    private PortworxVolumeSource portworxVolume;

    @JsonProperty("projected")
    private ProjectedVolumeSource projected;

    @JsonProperty("quobyte")
    private QuobyteVolumeSource quobyte;

    @JsonProperty("rbd")
    private RbdVolumeSource rbd;

    @JsonProperty("scaleIO")
    private ScaleIOVolumeSource scaleIo;

    @JsonProperty("secret")
    private SecretVolumeSource secret;

    @JsonProperty("storageos")
    private StorageOSVolumeSource storageos;

    @JsonProperty("vsphereVolume")
    private VsphereVirtualDiskVolumeSource vsphereVolume;
}
