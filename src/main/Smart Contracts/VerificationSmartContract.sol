pragma solidity ^0.4.0;

contract Verifier {


    function verify(string fingerPrint, string producer, bytes32 _message, uint8 _v, bytes32 _r, bytes32 _s){

        if(decryptSig(_message, _v, _r, _s)){

            verifiedData vData = verifiedData(0x28fb1aca4b64a6edff4d0287b81f0b2a2e75257b);
            vData.addRecord(fingerPrint, producer);

        }

    }

    function decryptSig(bytes32 _message, uint8 _v, bytes32 _r, bytes32 _s) constant returns (bool) {
        bytes32 prefixedHash = sha3(_message);
        address signer = ecrecover(_message, _v, _r, _s);
        if(check(signer)){

            return true;

        }
    }


    function check(address checkAddress) constant returns (bool) {
        ApprovedAddresses a = ApprovedAddresses(0x610033b6dd5a08004e46f2097ca09b693d744118);
        return a.getAddress(checkAddress);
    }
}

contract ApprovedAddresses{

    function getAddress(address anAddress) constant returns (bool);
}

contract verifiedData{

    function addRecord(string aFingerPrint, string aProducer);


}
