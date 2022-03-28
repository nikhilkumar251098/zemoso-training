import BookDetailView from "../../components/organisms/BookDetail/bookdetail";
import Footer from "../../components/molecules/Footer/footer";
import Header from "../../components/organisms/Header/header";


interface Props {}

const BookDetailViewPage = (props: Props) => {
  return (
    <>
      <Header />
      <BookDetailView />
      <Footer />
    </>
  );
};

export default BookDetailViewPage;
