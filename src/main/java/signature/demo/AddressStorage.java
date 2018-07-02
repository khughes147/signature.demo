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
public class AddressStorage extends Contract {
    private static final String BINARY = "6060604052341561000f57600080fd5b6102268061001e6000396000f30060606040526004361061004b5763ffffffff7c010000000000000000000000000000000000000000000000000000000060003504166338eada1c8114610050578063ae22c57d1461007e575b600080fd5b341561005b57600080fd5b61007c73ffffffffffffffffffffffffffffffffffffffff600435166100be565b005b341561008957600080fd5b6100aa73ffffffffffffffffffffffffffffffffffffffff6004351661014c565b604051901515815260200160405180910390f35b73fa5629c569f658a445cd7c6e7714bb715cee6a8b73ffffffffffffffffffffffffffffffffffffffff3316146100f457600080fd5b600080546001810161010683826101b0565b506000918252602090912001805473ffffffffffffffffffffffffffffffffffffffff191673ffffffffffffffffffffffffffffffffffffffff92909216919091179055565b6000805b6000548110156101a557600080548290811061016857fe5b60009182526020909120015473ffffffffffffffffffffffffffffffffffffffff8481169116141561019d57600191506101aa565b600101610150565b600091505b50919050565b8154818355818115116101d4576000838152602090206101d49181019083016101d9565b505050565b6101f791905b808211156101f357600081556001016101df565b5090565b905600a165627a7a723058209df0e59349945f85d826a6d01a5212fbc3cea6bdb20776f5c15f3bd46a608c940029";

    protected AddressStorage(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected AddressStorage(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public RemoteCall<TransactionReceipt> addAddress(String anAddress) {
        final Function function = new Function(
                "addAddress", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(anAddress)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<Boolean> getAddress(String anAddress) {
        final Function function = new Function("getAddress", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(anAddress)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public static RemoteCall<AddressStorage> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(AddressStorage.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<AddressStorage> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(AddressStorage.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    public static AddressStorage load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new AddressStorage(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static AddressStorage load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new AddressStorage(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}
