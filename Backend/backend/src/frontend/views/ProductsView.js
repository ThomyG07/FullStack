import { ProductsService } from "../services/ProductsService.js";
export class ProductsView
{
    constructor()
    {  this.displayProducts()



    }
    displayProducts()
    {
        let data = ProductsService.findAll().then((data) =>data.forEach((item) => {
            this.displayProduct(item)   
        }
        )
    )   
    }
    displayProduct(data)
    {
        const div = document.querySelector("div")
        const element = document.createElement("div");
        element.classList.add("products");
        div.appendChild(element);


        const par1 = document.createElement("p")
        par1.innerText = data.name;

        const par2 = document.createElement("p")
        par2.innerText = data.owner;

        const par3 = document.createElement("p")
        par3.innerText = data.bid;

        const bouton = document.createElement("button")
        bouton.innerText = 'Enchérir';

        element.appendChild(par1);
        element.appendChild(par2);
        element.appendChild(par3);
        element.appendChild(bouton);

    }


}