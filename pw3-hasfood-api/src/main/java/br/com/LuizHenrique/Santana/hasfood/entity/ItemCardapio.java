package br.com.LuizHenrique.Santana.hasfood.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.LuizHenrique.Santana.hasfood.enums.StatusEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="TBL_ITEM_CARDAPIO")
public class ItemCardapio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ITEM_CARDAPIO")
	private Long idItemCardapio;
	
	@Column(name = "TX_NOME")
	private String nome;
	
	@Column(name = "TX_DESCRICAO")
	private String descricao;
	
	@Column(name = "VLR_ITEM")
	private float valorItem;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "TX_STATUS")
	private StatusEnum status;
	
	@ManyToOne
	@JoinColumn(name = "ID_CATEGORIA_CARDAPIO")
	private CategoriaCardapio idCategoriaCardapio;
}
