package signature.demo;

import org.web3j.crypto.*;
//import org.web3j.crypto.signature.demo.Sign;


import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.Contract;
import org.web3j.utils.Numeric;

import java.math.BigInteger;

import static org.web3j.crypto.Hash.sha3;

public class signatureMain {

    public static void main(String[] args) throws Exception {

        Web3j web3j = Web3j.build(new HttpService());
        Credentials credentials = WalletUtils.loadCredentials("Ethereum", "C:\\Users\\kieran\\Documents\\EthereumProjectChain\\data\\keystore/UTC--2018-06-20T16-20-55.193747000Z--83e08a5e77901126a16721590a8e1379fb7b1b6b");
        byte[] HexMessage = Hash.sha3("TEST".getBytes());
        System.out.println("Address: " + credentials.getAddress());
        System.out.println("");
        System.out.println(BigInteger.valueOf(27));
        System.out.println("Final Message: " + Numeric.toHexString(HexMessage));
        System.out.println(Numeric.toHexString(HexMessage));

        Sign.SignatureData signature = Sign.signMessage(HexMessage, credentials.getEcKeyPair());
        System.out.println("R: " + Numeric.toHexString(signature.getR()));
        System.out.println("S: " + Numeric.toHexString(signature.getS()));
        System.out.println("V: " + Integer.toString(signature.getV()));


       // System.out.println(VerificationSmartContract.deploy(web3j,credentials, Contract.GAS_PRICE, Contract.GAS_LIMIT).send().getContractAddress());
       // System.out.println(AddressStorage.deploy(web3j,credentials, Contract.GAS_PRICE, Contract.GAS_LIMIT).send().getContractAddress());
      //  System.out.println(VerifiedData.deploy(web3j,credentials, Contract.GAS_PRICE, Contract.GAS_LIMIT).send().getContractAddress());

   //  AddressStorage aStore = AddressStorage.load("0x40e2a027c2aa8b9e934d69e5f32325ff04618ec9", web3j,credentials,Contract.GAS_PRICE, Contract.GAS_LIMIT);
      //  aStore.addAddress("0x83e08a5e77901126a16721590a8e1379fb7b1b6b").send();
     //   System.out.println(aStore.getAddress("0x83e08a5e77901126a16721590a8e1379fb7b1b6b").send());

     // VerificationSmartContract aVerifier = VerificationSmartContract.load("0x80530de5a509389a77dd418413c48ea434651b3b", web3j,credentials,Contract.GAS_PRICE, Contract.GAS_LIMIT);
      //aVerifier.verify("Kieran", "Hughes", HexMessage, BigInteger.valueOf(27), signature.getR() , signature.getS()).send();
      //  aVerifier.setVerifiedDataAddress("0x4087e6c5b789399c10216c9778660dba94dced3f").send();

     VerifiedData aData = VerifiedData.load("0x4087e6c5b789399c10216c9778660dba94dced3f", web3j,credentials,Contract.GAS_PRICE, Contract.GAS_LIMIT);
       System.out.println(aData.outputAll(BigInteger.valueOf(0)).send());
     //   System.out.println(aData.searchRecords("Kieran").send());
    } 
}
