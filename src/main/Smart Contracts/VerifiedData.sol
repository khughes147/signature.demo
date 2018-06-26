pragma solidity ^0.4.0;

contract ApprovedData {
    
        struct Record{
        
        string fingerPrint;
        string Producer;    
            
        }
        
        Record [] recordArray;
        
        modifier onlyCreator() {
        require(msg.sender == 0xbde95422681e4c3984635af2f2f35f8c44a4ddc9); // If it is incorrect here, it reverts.
        _;                              // Otherwise, it continues.
    }

        function addRecord(string aFingerPrint, string aProducer) onlyCreator {


            recordArray.push(Record(aFingerPrint, aProducer));


        }

        function searchRecords(string aFingerPrint) constant returns (bool) {

            for (uint i = 0; i < recordArray.length; i++) {

            if(keccak256(aFingerPrint) == keccak256(recordArray[i].fingerPrint)){

                return true;

            }
        }
        return false;
        }

        function outputAll(uint b) constant returns (string) {


            return recordArray[b].fingerPrint;
        }
        
}