package signature.demo;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 3.3.1.
 */
public class VerificationSmartContract extends Contract {
    private static final String BINARY = "6060604052341561000f57600080fd5b60008054600160a060020a033316600160a060020a03199091161790556104878061003b6000396000f3006060604052600436106100485763ffffffff60e060020a60003504166324318a2f811461004d57806372a9834d1461007b578063a775314a14610124578063c23697a81461015a575b600080fd5b341561005857600080fd5b61007973ffffffffffffffffffffffffffffffffffffffff60043516610186565b005b341561008657600080fd5b61007960046024813581810190830135806020601f8201819004810201604051908101604052818152929190602084018383808284378201915050505050509190803590602001908201803590602001908080601f0160208091040260200160405190810160405281815292919060208401838380828437509496505084359460ff6020820135169450604081013593506060013591506101ea9050565b341561012f57600080fd5b61014660043560ff6024351660443560643561033c565b604051901515815260200160405180910390f35b341561016557600080fd5b61014673ffffffffffffffffffffffffffffffffffffffff600435166103d5565b6000543373ffffffffffffffffffffffffffffffffffffffff9081169116146101ae57600080fd5b6001805473ffffffffffffffffffffffffffffffffffffffff191673ffffffffffffffffffffffffffffffffffffffff92909216919091179055565b60006101f88585858561033c565b15610333575060015473ffffffffffffffffffffffffffffffffffffffff168063c959624888886040518363ffffffff1660e060020a028152600401808060200180602001838103835285818151815260200191508051906020019080838360005b8381101561027257808201518382015260200161025a565b50505050905090810190601f16801561029f5780820380516001836020036101000a031916815260200191505b50838103825284818151815260200191508051906020019080838360005b838110156102d55780820151838201526020016102bd565b50505050905090810190601f1680156103025780820380516001836020036101000a031916815260200191505b50945050505050600060405180830381600087803b151561032257600080fd5b5af1151561032f57600080fd5b5050505b50505050505050565b600080600086604051908152602001604051809103902091506001878787876040516000815260200160405260405193845260ff9092166020808501919091526040808501929092526060840192909252608090920191516020810390808403906000865af115156103ad57600080fd5b50506020604051035190506103c1816103d5565b156103cb57600192505b5050949350505050565b60007306a5a9d42f8409ad279c1dba4763476147d994438063ae22c57d8460405160e060020a63ffffffff841602815273ffffffffffffffffffffffffffffffffffffffff9091166004820152602401602060405180830381600087803b151561043e57600080fd5b5af1151561044b57600080fd5b50505060405180519493505050505600a165627a7a7230582074090d036eec89f0190fa5154bcbeef196acefe0b7a6584d17943a225c2d8bf80029";

    protected VerificationSmartContract(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected VerificationSmartContract(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public RemoteCall<TransactionReceipt> setVerifiedDataAddress(String anAddress) {
        final Function function = new Function(
                "setVerifiedDataAddress", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(anAddress)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> verify(String fingerPrint, String producer, byte[] _message, BigInteger _v, byte[] _r, byte[] _s) {
        final Function function = new Function(
                "verify", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(fingerPrint), 
                new org.web3j.abi.datatypes.Utf8String(producer), 
                new org.web3j.abi.datatypes.generated.Bytes32(_message), 
                new org.web3j.abi.datatypes.generated.Uint8(_v), 
                new org.web3j.abi.datatypes.generated.Bytes32(_r), 
                new org.web3j.abi.datatypes.generated.Bytes32(_s)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<Boolean> decryptSig(byte[] _message, BigInteger _v, byte[] _r, byte[] _s) {
        final Function function = new Function("decryptSig", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(_message), 
                new org.web3j.abi.datatypes.generated.Uint8(_v), 
                new org.web3j.abi.datatypes.generated.Bytes32(_r), 
                new org.web3j.abi.datatypes.generated.Bytes32(_s)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteCall<Boolean> check(String checkAddress) {
        final Function function = new Function("check", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(checkAddress)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public static RemoteCall<VerificationSmartContract> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(VerificationSmartContract.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<VerificationSmartContract> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(VerificationSmartContract.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    public static VerificationSmartContract load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new VerificationSmartContract(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static VerificationSmartContract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new VerificationSmartContract(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}
