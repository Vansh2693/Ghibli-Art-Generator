export default function Gallery(){
    return (
        <section id="gallery" className="bg-secondary py-20 px-8">
            <h3 className="text-3xl font-bold text-center mb-12">Gallery</h3>
        
            <div className="grid md:grid-cols-3 gap-6">
                {[1,2,3].map((i)=>(
                    <div key={i} className="h-60 bg-white rounder-lg shadow-md flex items-center justify-center text-gray-400">
                        Generated Image
                    </div>
                ))}
            </div>
        </section>
    );
}