export default class Utils {

    //Navegar na Url
    navegar(url) {
        cy.visit(url)
    }

    //=========================================================================
    // FUNCOES DE CLICK

    click(element) {
        cy.get(element).click()
    }

    clickForce(elemet){ 
        cy.get(elemet).click({force:true}) 
     }


    //=========================================================================
    // FUNCOES PREENCHER
    
    preencherInput(element, text) {
        cy.get(element).clear()
        cy.get(element).type(text)
    }
   
     preencherInputComTeclaNoFinal(element, text, tecla){
        cy.get(element).type(text).type(tecla);
     }
   
     preencherInputForce(element, text){ 
        cy.get(element).type(text, {force:true})
     }
     
     tempo(tempo){ 
        cy.wait(tempo) 
     }
   
     select(element, value){ 
        cy.get(element).select(value) 
     }
   
     //=========================================================================
     // FUNCOES VALIDACOES

     validarText(element, text){ 
        cy.get(element).should('contain', text) 
     }
   
     validarQuantItemNaLista(element, quant){
        cy.get(element).should('have.length', quant)
     }
}