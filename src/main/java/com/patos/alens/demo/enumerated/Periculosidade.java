package com.patos.alens.demo.enumerated;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * O enumerador Periculosidade é responsável por representar o grau de periculosidade de uma nave ao se aproximar dela
 * @author Kaique Queiros kaique_q@outlook.com
 */
@Getter
@AllArgsConstructor
public enum Periculosidade {
    SEGURO("Seguro"),
    CAUTELA("Cautela"),
    AMEAÇA_POTENCIAL("Ameaça Potencial"),
    AMEAÇA_IMINENTE("Ameaça Iminente"),
    EXTINCAO_ASSEGURADA("Extinção Assegurada");

    private final String nome;
}
