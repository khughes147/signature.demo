pragma solidity ^0.4.0;

contract AddressStore {
    
    address [] addressList;
    
    modifier onlyCreator() {
        require(msg.sender == 0xca35b7d915458ef540ade6068dfe2f44e8fa733c); // If it is incorrect here, it reverts.
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