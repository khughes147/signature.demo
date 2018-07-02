pragma solidity ^0.4.0;

contract VerificationSmartContract {


    address private owner;
    address private verifiedDataAddress;


    function VerificationSmartContract() public {

    owner = msg.sender;

    }

    modifier onlyOwner() {
        require(msg.sender == owner); // If it is incorrect here, it reverts.
        _;                              // Otherwise, it continues.
    }



    function verify(string fingerPrint, string producer, bytes32 _message, uint8 _v, bytes32 _r, bytes32 _s){

        if(decryptSig(_message, _v, _r, _s)){

            VerifiedData vData = VerifiedData(verifiedDataAddress);
            vData.addRecord(fingerPrint, producer);

        }

    }

    function setVerifiedDataAddress(address anAddress) onlyOwner {

        verifiedDataAddress = anAddress;

    }

    function decryptSig(bytes32 _message, uint8 _v, bytes32 _r, bytes32 _s) constant returns (bool) {
        bytes32 prefixedHash = sha3(_message);
        address signer = ecrecover(_message, _v, _r, _s);
        if(check(signer)){

            return true;

        }
    }


    function check(address checkAddress) constant returns (bool) {
        AddressStorage a = AddressStorage(0x06a5a9d42f8409ad279c1dba4763476147d99443);
        return a.getAddress(checkAddress);
    }
}

contract AddressStorage{

    function getAddress(address anAddress) constant returns (bool);
}

contract VerifiedData{

    function addRecord(string aFingerPrint, string aProducer);


}
