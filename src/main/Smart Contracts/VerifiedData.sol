pragma solidity ^0.4.0;

contract VerifiedData {
    
        struct Record{
        
        string fingerPrint;
        string Producer;    
            
        }
        
        Record [] recordArray;
        
        modifier onlyCreator() {
        require(msg.sender == 0xf2527b7254a875a2b4b95d9c9e9811e5d3b72731); // If it is incorrect here, it reverts.
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