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
    private static final String BINARY = "6060604052341561000f57600080fd5b6105e68061001e6000396000f3006060604052600436106100565763ffffffff7c0100000000000000000000000000000000000000000000000000000000600035041663c9596248811461005b578063de6bce9c146100f0578063e74211151461017d575b600080fd5b341561006657600080fd5b6100ee60046024813581810190830135806020601f8201819004810201604051908101604052818152929190602084018383808284378201915050505050509190803590602001908201803590602001908080601f0160208091040260200160405190810160405281815292919060208401838380828437509496506101e295505050505050565b005b34156100fb57600080fd5b610106600435610288565b60405160208082528190810183818151815260200191508051906020019080838360005b8381101561014257808201518382015260200161012a565b50505050905090810190601f16801561016f5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b341561018857600080fd5b6101ce60046024813581810190830135806020601f8201819004810201604051908101604052818152929190602084018383808284375094965061034f95505050505050565b604051901515815260200160405180910390f35b73f2527b7254a875a2b4b95d9c9e9811e5d3b7273173ffffffffffffffffffffffffffffffffffffffff33161461021857600080fd5b600080546001810161022a8382610464565b916000526020600020906002020160006040805190810160405285815260208101859052919050815181908051610265929160200190610495565b50602082015181600101908051610280929160200190610495565b505050505050565b610290610513565b600080548390811061029e57fe5b90600052602060002090600202016000018054600181600116156101000203166002900480601f0160208091040260200160405190810160405280929190818152602001828054600181600116156101000203166002900480156103435780601f1061031857610100808354040283529160200191610343565b820191906000526020600020905b81548152906001019060200180831161032657829003601f168201915b50505050509050919050565b6000805b60005481101561045957600080548290811061036b57fe5b906000526020600020906002020160000160405180828054600181600116156101000203166002900480156103d75780601f106103b55761010080835404028352918201916103d7565b820191906000526020600020905b8154815290600101906020018083116103c3575b5050915050604051908190039020836040518082805190602001908083835b602083106104155780518252601f1990920191602091820191016103f6565b6001836020036101000a03801982511681845116179092525050509190910192506040915050519081900390201415610451576001915061045e565b600101610353565b600091505b50919050565b815481835581811511610490576002028160020283600052602060002091820191016104909190610525565b505050565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f106104d657805160ff1916838001178555610503565b82800160010185558215610503579182015b828111156105035782518255916020019190600101906104e8565b5061050f929150610559565b5090565b60206040519081016040526000815290565b61055691905b8082111561050f57600061053f8282610573565b61054d600183016000610573565b5060020161052b565b90565b61055691905b8082111561050f576000815560010161055f565b50805460018160011615610100020316600290046000825580601f1061059957506105b7565b601f0160209004906000526020600020908101906105b79190610559565b505600a165627a7a723058202fb9dfa3ddf4c5a138a0efe495c4cf28e6b22a85a6e04ea213ef4ed8c8990e790029";

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
