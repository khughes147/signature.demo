pragma solidity ^0.4.0;

contract VerifiedData {
    
        struct Record{
        
        string fingerPrint;
        string Producer;    
            
        }
        
        Record [] recordArray;
        
        modifier onlyCreator() {
        require(msg.sender == 0x1c649a710a74af7a5f96b475ea5618a5b0b8f505); // If it is incorrect here, it reverts.
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