package signature.demo;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
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
public class VerifiedData extends Contract {
    private static final String BINARY = "6060604052341561000f57600080fd5b6106238061001e6000396000f3006060604052600436106100565763ffffffff7c0100000000000000000000000000000000000000000000000000000000600035041663c9596248811461005b578063de6bce9c14610165578063e74211151461017b575b600080fd5b341561006657600080fd5b6100ee60046024813581810190830135806020601f8201819004810201604051908101604052818152929190602084018383808284378201915050505050509190803590602001908201803590602001908080601f0160208091040260200160405190810160405281815292919060208401838380828437509496506101e095505050505050565b60405160208082528190810183818151815260200191508051906020019080838360005b8381101561012a578082015183820152602001610112565b50505050905090810190601f1680156101575780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b341561017057600080fd5b6100ee6004356102c5565b341561018657600080fd5b6101cc60046024813581810190830135806020601f8201819004810201604051908101604052818152929190602084018383808284375094965061038c95505050505050565b604051901515815260200160405180910390f35b6101e86104a1565b7380530de5a509389a77dd418413c48ea434651b3b73ffffffffffffffffffffffffffffffffffffffff33161461021e57600080fd5b600080546001810161023083826104b3565b91600052602060002090600202016000604080519081016040528681526020810186905291905081518190805161026b9291602001906104e4565b506020820151816001019080516102869291602001906104e4565b5050505060408051908101604052600481527f646f6e650000000000000000000000000000000000000000000000000000000060208201529392505050565b6102cd6104a1565b60008054839081106102db57fe5b90600052602060002090600202016000018054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156103805780601f1061035557610100808354040283529160200191610380565b820191906000526020600020905b81548152906001019060200180831161036357829003601f168201915b50505050509050919050565b6000805b6000548110156104965760008054829081106103a857fe5b906000526020600020906002020160000160405180828054600181600116156101000203166002900480156104145780601f106103f2576101008083540402835291820191610414565b820191906000526020600020905b815481529060010190602001808311610400575b5050915050604051908190039020836040518082805190602001908083835b602083106104525780518252601f199092019160209182019101610433565b6001836020036101000a0380198251168184511617909252505050919091019250604091505051908190039020141561048e576001915061049b565b600101610390565b600091505b50919050565b60206040519081016040526000815290565b8154818355818115116104df576002028160020283600052602060002091820191016104df9190610562565b505050565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f1061052557805160ff1916838001178555610552565b82800160010185558215610552579182015b82811115610552578251825591602001919060010190610537565b5061055e929150610596565b5090565b61059391905b8082111561055e57600061057c82826105b0565b61058a6001830160006105b0565b50600201610568565b90565b61059391905b8082111561055e576000815560010161059c565b50805460018160011615610100020316600290046000825580601f106105d657506105f4565b601f0160209004906000526020600020908101906105f49190610596565b505600a165627a7a7230582044da6051033d1a75d5ca6a28c1071cfb6e7ad77f5ad57914228358082a012d660029";

    protected VerifiedData(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected VerifiedData(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public RemoteCall<TransactionReceipt> addRecord(String aFingerPrint, String aProducer) {
        final Function function = new Function(
                "addRecord", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(aFingerPrint), 
                new org.web3j.abi.datatypes.Utf8String(aProducer)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> outputAll(BigInteger b) {
        final Function function = new Function("outputAll", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(b)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<Boolean> searchRecords(String aFingerPrint) {
        final Function function = new Function("searchRecords", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(aFingerPrint)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public static RemoteCall<VerifiedData> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(VerifiedData.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<VerifiedData> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(VerifiedData.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    public static VerifiedData load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new VerifiedData(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static VerifiedData load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new VerifiedData(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}
