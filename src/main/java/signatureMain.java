import com.sun.org.apache.xpath.internal.SourceTree;
import org.web3j.abi.datatypes.generated.Bytes32;
import org.web3j.abi.datatypes.generated.Uint8;
import org.web3j.crypto.*;
import org.web3j.crypto.WalletUtils;

import org.web3j.utils.Bytes;
import org.web3j.utils.Numeric;

import java.io.IOException;
import java.security.SignatureException;

import static org.web3j.crypto.Hash.sha3;

public class signatureMain {

    public static void main(String[] args) throws SignatureException, IOException, CipherException {


        Credentials credentials = WalletUtils.loadCredentials("Ethereum", "C:\\Users\\khugh\\Documents\\EthereumProjectChain\\data\\keystore/UTC--2018-06-22T09-50-52.016355100Z--fa5629c569f658a445cd7c6e7714bb715cee6a8b");
        byte[] HexMessage = Hash.sha3("TEST".getBytes());
        System.out.println("Address: " + credentials.getAddress());
        System.out.println("");
        System.out.println("");
        System.out.println("Final Message: " + Numeric.toHexString(HexMessage));
        Sign.SignatureData signature = Sign.signMessage(HexMessage, credentials.getEcKeyPair());
        System.out.println("R: " + Numeric.toHexString(signature.getR()));
        System.out.println("S: " + Numeric.toHexString(signature.getS()));
        System.out.println("V: " + Integer.toString(signature.getV()));


    } 
}
