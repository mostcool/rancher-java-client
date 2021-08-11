package io.rancher;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ClientUtils {

    private static final ConcurrentMap<String, ClientUtils> RANCHER_UTIL_MAP = new ConcurrentHashMap<>();

    private final Client client;

    private ClientUtils(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public static ClientUtils build(final String apiHost, final String accessKey, final String secretKey) {
        if (isBlank(apiHost) || isBlank(accessKey) || isBlank(secretKey)) {
            return null;
        }
        String key = getMD5InHex(apiHost + accessKey + secretKey);
        if (RANCHER_UTIL_MAP.containsKey(key)) {
            return RANCHER_UTIL_MAP.get(key);
        }
        ClientUtils clientUtil = new ClientUtils(new Client(apiHost, accessKey, secretKey));
        RANCHER_UTIL_MAP.put(key, clientUtil);
        return clientUtil;
    }

    private static boolean isBlank(String content) {
        if (content == null) {
            return true;
        }
        return content.trim().length() <= 0;
    }

    private static String getMD5InHex(String data) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(data.getBytes());
            byte[] result = messageDigest.digest();
            return new BigInteger(1, result).toString(16);
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }
}
