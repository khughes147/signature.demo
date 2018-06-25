pragma solidity ^0.4.0;

contract credentials {
    
        string fingerPrint;
        string Producer;
        
    
    
    /* This runs when the contract is executed */
    constructor(string _fingerprint, string _producer) public {
        fingerPrint = _fingerprint;
        Producer = _producer;
        
    }

   function verify(bytes32 _message, uint8 _v, bytes32 _r, bytes32 _s) constant returns (address) {
        bytes32 prefixedHash = sha3(_message);
        address signer = ecrecover(_message, _v, _r, _s);
        return signer;
    }

    function check(address callbackAddress, address checkAddress) returns (bool) {
        ApprovedAddresses a = ApprovedAddresses(callbackAddress);
        return a.getAddress(checkAddress);
    }
}

contract ApprovedAddresses{
    
    function getAddress(address anAddress) returns (bool);
}
