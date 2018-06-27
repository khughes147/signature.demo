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
        System.out.println("");
        System.out.println("Final Message: " + Numeric.toHexString(HexMessage));
        Sign.SignatureData signature = Sign.signMessage(HexMessage, credentials.getEcKeyPair());
        System.out.println("R: " + Numeric.toHexString(signature.getR()));
        System.out.println("S: " + Numeric.toHexString(signature.getS()));
        System.out.println("V: " + Integer.toString(signature.getV()));


        //System.out.println(VerificationSmartContract.deploy(web3j,credentials, Contract.GAS_PRICE, Contract.GAS_LIMIT).send().getContractAddress());
       // System.out.println(AddressStorage.deploy(web3j,credentials, Contract.GAS_PRICE, Contract.GAS_LIMIT).send().getContractAddress());
      //  System.out.println(VerifiedData.deploy(web3j,credentials, Contract.GAS_PRICE, Contract.GAS_LIMIT).send().getContractAddress());

    // AddressStorage aStore = AddressStorage.load("0x8f4728369149bd06d56fe2481219f81a1a775a04", web3j,credentials,Contract.GAS_PRICE, Contract.GAS_LIMIT);
     //   aStore.addAddress("0x83e08a5e77901126a16721590a8e1379fb7b1b6b").send();
      //  System.out.println(aStore.getAddress("0x83e08a5e77901126a16721590a8e1379fb7b1b6b").send());

      //VerificationSmartContract aVerifier = VerificationSmartContract.load("0xd2308c6a1b25362636efc2a271b690b374afc191", web3j,credentials,Contract.GAS_PRICE, Contract.GAS_LIMIT);
     // aVerifier.verify("Kieran", "Hughes", HexMessage,Numeric.toBigInt(String.valueOf(27)), signature.getR() , signature.getS()).send();
    //    aVerifier.setVerifiedDataAddress("0xdff0cabbc9c6850d1e4ea371cfa12afda09afd11").send();

      //VerifiedData aData = VerifiedData.load("0xdff0cabbc9c6850d1e4ea371cfa12afda09afd11", web3j,credentials,Contract.GAS_PRICE, Contract.GAS_LIMIT);
        //System.out.println(aData.outputAll(BigInteger.valueOf(0)).send());
       // System.out.println(aData.searchRecords("Kieran").send());
    } 
}
