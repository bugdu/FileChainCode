/**
 * @author newonexd
 * @ClassName Const
 * Description 常量信息
 * @date 2019-12-28 11:05
 * @Version 1.0
 */
public final class Const {
    public static String BASE_PATH = Const.class.getClassLoader().getResource("./").getPath().substring(1);
    public static final String PEER0_ORG1_DOMAIN_NAME = "peer0.org1.example.com";   //peer节点域名

    public static final String PEER0_ORG2_DOMAIN_NAME = "peer0.org2.example.com";   //peer节点域名

    public static final String PEER0_ORG1_HOST = "grpcs://peer0.org1.example.com:7051";  //peer节点主机地址+端口号(主机地址需要与Fabric网络中peer节点对应)

    public static final String PEER0_ORG2_HOST = "grpcs://peer0.org2.example.com:7051";  //peer节点主机地址+端口号(主机地址需要与Fabric网络中peer节点对应)

    public static final String PEER0_ORG1_TLS_DIR =
            BASE_PATH + "crypto-config/peerOrganizations/org1.example.com/tlsca/tlsca.org1.example.com-cert.pem";

    public static final String PEER0_ORG2_TLS_DIR = BASE_PATH + "crypto-config/peerOrganizations/org2.example.com/tlsca/tlsca.org2.example.com-cert.pem";

    public static final String ORDERER_DOMAIN_NAME = "orderer.example.com"; //orderer节点域名

    public static final String ORDERER_TLS_DIR = BASE_PATH + "crypto-config/ordererOrganizations/example.com/orderers/orderer.example.com/tls/ca.crt";

    public static final String ORDERER_HOST = "grpcs://orderer.example.com:7050"; //orderer节点主机地址+端口号
    // (主机地址需要与Fabric网络中orderer节点对应)

    public static final String CHANNEL_NAME = "mychannel";  //通道名称

    public static final String CHAINCODE_NAME = "wushuang"; //链码名称

    public static final String CHAINCODE_VERSION = "8"; //链码版本

    public static final String CHAINCODE_PATH = "/opt/gopath/src/github.com/chaincode/chaincode-0630"; //链码版本


    public static final String USER_MSP_ID="Org1MSP";

    public static final String USER_AFFILIATION="org1";

    public static final String USER_KEY_FILE = BASE_PATH + "crypto-config/peerOrganizations/org1.example.com/users/Admin@org1"
            + ".example.com/msp/keystore/priv_sk";    //当前用户秘钥文件路径

    public static final String USER_CERT_FILE = BASE_PATH + "crypto-config/peerOrganizations/org1.example.com/users/Admin@org1"
            + ".example.com/msp/signcerts/Admin@org1.example.com-cert.pem";  //当前用户证书文件路径

}
