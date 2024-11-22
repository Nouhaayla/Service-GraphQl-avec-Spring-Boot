package ma.projet.graph.entities;

import java.time.LocalDate;
import lombok.Data;

@Data
public class TransactionRequest {
    private Long compteId;
    private double montant;
    private LocalDate date;
    private TypeTransaction type;

}
