import ExploreModal from "./exploremodal";
import { ComponentMeta, ComponentStory } from "@storybook/react";

export default {
  title: "Molecules/Explore Modal",
  component: ExploreModal,
} as ComponentMeta<typeof ExploreModal>;

const Template: ComponentStory<typeof ExploreModal> = (args) => (
  <ExploreModal {...args} />
);

export const ExploreModal1 = Template.bind({});
ExploreModal1.args = {};
