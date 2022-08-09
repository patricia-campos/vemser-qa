
/*
describe('empty spec', () => {
  it('passes', () => {
    cy.visit('https://example.cypress.io')
  })
})

context('Todo', () => {

  it('Inserir nova tarefa', () => {

    // URL
    cy.visit('https://todomvc.com/examples/react/#/');

    cy.get('body > section > div > header > input')
      .type('vem ser qa')
      .type('{enter}');


      cy.get('body > section > div > section > ul > li').should('have.length', 1);

      cy.get('input.toggle').click();

      cy.get('body > section > div > footer > ul > li:nth-child(3) > a').click();

      cy.get('body > section > div > section > ul > li').should('have.length', 0);


    //cy.get('seletor').click();
    //cy.get('seletor').type('arroz');

   
    //===================================================================================================


    // PRIMEIRA ATIVIDADE - DEU RUIM NO ENDEREÇO

    context('Register', () => {

      it('Cadastrar Usuario', () => {
    
        // URL
        cy.visit('https://demo.automationtesting.in/Register.html');
    
        // Full Name
        cy.get('#basicBootstrapForm > div:nth-child(1) > div:nth-child(2) > input')
          .type('Coraline')
          .type('{enter}');

        cy.get('#basicBootstrapForm > div:nth-child(1) > div:nth-child(3) > input')
         .type('Jones')
         .type('{enter}');

         // Address
         cy.get('#basicBootstrapForm > div:nth-child(2) > div > textarea')
          .type('Este é um endereço qualquer')

          // Email
          cy.get('#eid > input')
          .type('coraline@coraline.com')

          // Phone
          cy.get('#basicBootstrapForm > div:nth-child(4) > div > input')
          .type('123456789')

          // Gender
          cy.get('#basicBootstrapForm > div:nth-child(5) > div > label:nth-child(2) > input').click();

          // Hobbies
          cy.get('#checkbox2').click();

          // Languages
          // cy.get('#msdd').click()
          // cy.get('#basicBootstrapForm > div:nth-child(7) > div > multi-select > div:nth-child(2) > ul > li:nth-child(5) > a').click();

          // Endereço
          cy.get('#countries')
          .type('Brazil', {force: true})

           

    //===================================================================================================

    
    // SEGUNDA ATIVIDADE 

    context('Login', () => {

      it('Login', () => {
    
        // URL
        cy.visit('https://demoqa.com/login');
    
        // Username e Password
        cy.get('#userName')
          .type('Coraline')

        cy.get('#password')
         .type('123')
         //.type('{enter}');

        cy.get('#newUser').click();

      })

    //==============================================================

        it('Register', () => {
    
          // URL
          cy.visit('https://demoqa.com/register');
      
          // Username e Password
          cy.get('#firstname')
            .type('Coraline')
            
          cy.get('#lastname')
            .type('Jones')

            cy.get('#userName')
            .type('Coraline')
  
          cy.get('#password')
           .type('123')

           cy.get('#recaptcha-anchor > div.recaptcha-checkbox-border').click();

           cy.get('#register').click();
           cy.wait(500);
    

  })

})
*/