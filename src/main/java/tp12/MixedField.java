package tp12;

import java.util.ArrayList;
import java.util.List;

public class MixedField extends Field {
    private List<Field> fields;

    public MixedField() {
        this.fields = new ArrayList<>();
    }

    public void addField(Field f) {
        fields.add(f);
    }

    @Override
    public double annualEarnings() {
        return fields.stream().mapToDouble(Field::annualEarnings).sum() / fields.size();
    }
}

/*
“la ganancia proporcional a la cantidad de subparcelas”
Si una parcela produce $500
Se divide por la cantidad de subparcelas (en este caso 4)
Cada parte representa 1/4 de la superficie

IDEA: cada hijo representa una fracción del padre
*/

