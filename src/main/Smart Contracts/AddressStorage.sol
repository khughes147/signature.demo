pragma solidity ^0.4.0;

contract AddressStore {
    
    address [] addressList;
    
    function addAddress(address anAddress){
        
        addressList.push(anAddress);
        
    }
    
    function getAddress(address anAddress) returns (bool) {
        
        for (uint i = 0; i < addressList.length; i++) {
            
            if(anAddress == addressList[i]){
                
                return true;
                
            }
        }
        return false;
        
    }
    
}