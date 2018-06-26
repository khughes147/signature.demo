pragma solidity ^0.4.0;

contract Verifier {


    address private owner;
    address private verifiedDataAddress;


    function Verifier() public {

    owner = msg.sender;

    }

    modifier onlyOwner() {
        require(msg.sender == owner); // If it is incorrect here, it reverts.
        _;                              // Otherwise, it continues.
    }



    function verify(string fingerPrint, string producer, bytes32 _message, uint8 _v, bytes32 _r, bytes32 _s){

        if(decryptSig(_message, _v, _r, _s)){

            verifiedData vData = verifiedData(verifiedDataAddress);
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
        ApprovedAddresses a = ApprovedAddresses(0x0dcd2f752394c41875e259e00bb44fd505297caf );
        return a.getAddress(checkAddress);
    }
}

contract ApprovedAddresses{

    function getAddress(address anAddress) constant returns (bool);
}

contract verifiedData{

    function addRecord(string aFingerPrint, string aProducer);


}
