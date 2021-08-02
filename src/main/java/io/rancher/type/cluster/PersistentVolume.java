package io.rancher.type.cluster;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.rancher.base.AbstractType;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;

@Data
@Accessors(chain = true)
public class PersistentVolume extends AbstractType {

    @JsonProperty("accessModes")
    private List<String> accessModes;

    @JsonProperty("annotations")
    private Map<String, Object> annotations;

    @JsonProperty("awsElasticBlockStore")
    private AwsElasticBlockStoreVolumeSource awsElasticBlockStore;

    @JsonProperty("azureDisk")
    private AzureDiskVolumeSource azureDisk;

    @JsonProperty("azureFile")
    private AzureFilePersistentVolumeSource azureFile;

    @JsonProperty("capacity")
    private Map<String, Object> capacity;

    @JsonProperty("cephfs")
    private CephFSPersistentVolumeSource cephfs;

    @JsonProperty("cinder")
    private CinderPersistentVolumeSource cinder;

    @JsonProperty("claimRef")
    private ObjectReference claimRef;

    @JsonProperty("created")
    private String created;

    @JsonProperty("creatorId")
    private String creatorId;

    @JsonProperty("csi")
    private CsiPersistentVolumeSource csi;

    @JsonProperty("description")
    private String description;

    @JsonProperty("fc")
    private FcVolumeSource fc;

    @JsonProperty("flexVolume")
    private FlexPersistentVolumeSource flexVolume;

    @JsonProperty("flocker")
    private FlockerVolumeSource flocker;

    @JsonProperty("gcePersistentDisk")
    private GcePersistentDiskVolumeSource gcePersistentDisk;

    @JsonProperty("glusterfs")
    private GlusterfsPersistentVolumeSource glusterfs;

    @JsonProperty("hostPath")
    private HostPathVolumeSource hostPath;

    @JsonProperty("iscsi")
    private IscsiPersistentVolumeSource iscsi;

    @JsonProperty("labels")
    private Map<String, Object> labels;

    @JsonProperty("local")
    private LocalVolumeSource local;

    @JsonProperty("mountOptions")
    private List<String> mountOptions;

    /**
     * required true
     */
    @JsonProperty("name")
    private String name;

    @JsonProperty("nfs")
    private NfsVolumeSource nfs;

    @JsonProperty("nodeAffinity")
    private VolumeNodeAffinity nodeAffinity;

    @JsonProperty("ownerReferences")
    private List<OwnerReference> ownerReferences;

    @JsonProperty("persistentVolumeReclaimPolicy")
    private String persistentVolumeReclaimPolicy;

    @JsonProperty("photonPersistentDisk")
    private PhotonPersistentDiskVolumeSource photonPersistentDisk;

    @JsonProperty("portworxVolume")
    private PortworxVolumeSource portworxVolume;

    @JsonProperty("quobyte")
    private QuobyteVolumeSource quobyte;

    @JsonProperty("rbd")
    private RbdPersistentVolumeSource rbd;

    @JsonProperty("removed")
    private String removed;

    @JsonProperty("scaleIO")
    private ScaleIOPersistentVolumeSource scaleIo;

    @JsonProperty("state")
    private String state;

    @JsonProperty("status")
    private PersistentVolumeStatus status;

    @JsonProperty("storageClassId")
    private String storageClassId;

    @JsonProperty("storageos")
    private StorageOSPersistentVolumeSource storageos;

    @JsonProperty("transitioning")
    private String transitioning;

    @JsonProperty("transitioningMessage")
    private String transitioningMessage;

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("volumeMode")
    private String volumeMode;

    @JsonProperty("vsphereVolume")
    private VsphereVirtualDiskVolumeSource vsphereVolume;
}
