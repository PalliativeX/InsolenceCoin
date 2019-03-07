
// Used to reference TransactionOutputs which haven't been spent yet. Id is used to find relevant UTXO
// The input is always a link to the previous output (we got money - input, we reference the output)
public class TransactionInput {
    public String transactionOutputId; //Reference to TransactionOutputs -> transactionId
    public TransactionOutput UTXO; //Contains the Unspent transaction output

    public TransactionInput(String transactionOutputId) {
        this.transactionOutputId = transactionOutputId;
    }
}