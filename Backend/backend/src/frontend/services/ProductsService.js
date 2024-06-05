export class ProductsService
{
     static async findAll()
    {
        const response = await fetch("http://localhost:8080/products")
        if(response.status === 200)
        {
            const data = await response.json();
            return data;

        }
        else
        {

            console.log("no")
        }



    }
    static async bid(id)
    {
        let url ="http://localhost:8080/bid/" + id 
        const response = await fetch(url, {
            method: "post"})
        if(response.status ===200)
        {
            return true


        }
        else
        {

            return false
        }



    }


}