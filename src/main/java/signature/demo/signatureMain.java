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
        Credentials credentials = WalletUtils.loadCredentials("Ethereum", "C:\\Users\\khugh\\Documents\\EthereumProjectChain\\data\\keystore/UTC--2018-06-22T09-50-52.016355100Z--fa5629c569f658a445cd7c6e7714bb715cee6a8b");
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
     //   System.out.println(VerifiedData.deploy(web3j,credentials, Contract.GAS_PRICE, Contract.GAS_LIMIT).send().getContractAddress());

    // AddressStorage aStore = AddressStorage.load("0x06a5a9d42f8409ad279c1dba4763476147d99443", web3j,credentials,Contract.GAS_PRICE, Contract.GAS_LIMIT);
     //   aStore.addAddress("0xfa5629c569f658a445cd7c6e7714bb715cee6a8b").send();
     //  System.out.println(aStore.getAddress("0xfa5629c569f658a445cd7c6e7714bb715cee6a8b").send());

   //  VerificationSmartContract aVerifier = VerificationSmartContract.load("0xf2527b7254a875a2b4b95d9c9e9811e5d3b72731", web3j,credentials,Contract.GAS_PRICE, Contract.GAS_LIMIT);
    // aVerifier.verify("Jordanstown", "Wang", HexMessage, BigInteger.valueOf(28), signature.getR() , signature.getS()).send();
      //  aVerifier.setVerifiedDataAddress("0x7beb1fc32f8394da52cd9d98abfc521f6b432027").send();

    VerifiedData aData = VerifiedData.load("0x7beb1fc32f8394da52cd9d98abfc521f6b432027", web3j,credentials,Contract.GAS_PRICE, Contract.GAS_LIMIT);
    System.out.println(aData.outputAll(BigInteger.valueOf(2)).send());
     //   System.out.println(aData.searchRecords("Kieran").send());
    } 
}
