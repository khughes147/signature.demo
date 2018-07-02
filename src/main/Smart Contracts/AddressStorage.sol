pragma solidity ^0.4.0;

contract AddressStorage {

    address [] addressList;

    modifier onlyCreator() {
        require(msg.sender == 0xfa5629c569f658a445cd7c6e7714bb715cee6a8b); // If it is incorrect here, it reverts.
        _;                              // Otherwise, it continues.
    }


    function addAddress(address anAddress) onlyCreator {
        
        addressList.push(anAddress);
        
    }
    
    function getAddress(address anAddress) constant returns (bool) {
        
        for (uint i = 0; i < addressList.length; i++) {
            
            if(anAddress == addressList[i]){
                
                return true;
                
            }
        }
        return false;
        
    }
    
}