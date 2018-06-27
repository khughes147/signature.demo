pragma solidity ^0.4.0;

contract AddressStorage {

    address [] addressList;

    modifier onlyCreator() {
        require(msg.sender == 0x83e08a5e77901126a16721590a8e1379fb7b1b6b); // If it is incorrect here, it reverts.
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