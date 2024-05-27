import { ProductsService } from "../services/ProductsService.js";
export class ProductsView
{
    ProductsView()
    {  this.displayProduct()



    }
    displayProducts()
    {
        let data = ProductsService.findAll().then((data) => data.forEach((item) => {
            console.log(data)
            this.displayProduct(item)   
        }))
    
    
    }
    displayProduct(data)
    {
        console.log(data)
        const div = document.querySelector("div")
        const element = document.createElement("div");
        element.classList.add("products");
        div.appendChild(element);


        const par1 = document.createElement("p")
        par1.innerText = data.name;

        const par2 = document.createElement("p")
        par1.innerText = data.owner;

        const par3 = document.createElement("p")
        par1.innerText = data.bid;

        const bouton = document.createElement("button")
        bouton.innerText = 'Enchérir';
    }


}