pragma solidity ^0.4.0;

contract ApprovedData {
    
        struct Record{
        
        string fingerPrint;
        string Producer;    
            
        }
        
        Record [] recordArray;
        
        function addRecord(string aFingerPrint, string aProducer) {
            
           
            recordArray.push(Record(aFingerPrint, aProducer));
            
        }
        
        function searchRecords(string aFingerPrint) returns (bool) {
            
            for (uint i = 0; i < recordArray.length; i++) {
            
            if(keccak256(aFingerPrint) == keccak256(recordArray[i].fingerPrint)){
                
                return true;
                
            }
        }
        return false;
        }
        
}